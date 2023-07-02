<div align="center">

# rapier-java
[![CI](https://img.shields.io/github/actions/workflow/status/aecsocket/rapier-ffi/build-java.yml)](https://github.com/aecsocket/rapier-ffi/actions/workflows/build-java.yml)
![Release](https://img.shields.io/maven-central/v/io.github.aecsocket/rapier-java?label=release)
![Snapshot](https://img.shields.io/nexus/s/io.github.aecsocket/rapier-java?label=snapshot&server=https%3A%2F%2Fs01.oss.sonatype.org)

Java bindings for the Rapier physics engine

### [GitHub](https://github.com/aecsocket/rapier-ffi/tree/main/rapier-java)

</div>

A set of Java classes which wrap around Rapier, using `rapier-ffi` and Java 19's Foreign Function API to interface
with the engine. This means that **currently this will only run on Java 19 *exactly*!** (Java 20 introduces breaking
changes to this API). This will hopefully soon be updated to Java 21 (LTS) when that's released.

## Usage

The library is split into several variants:
- `rapier-java-dimX-fY` where
  - `dimX` is the dimension (dim2 2D or dim3 3D)
  - `fY` is the precision (f32 `float` or f64 `double`)

Each variant has a subproject to provide native binaries for that variant:
- `rapier-java-dimX-fY-platform-arch` where
  - `platform` is the operating system (`linux`, `windows`, `macos`)
  - `arch` is the CPU architecture (`x86`)

Add the required dependencies to your Gradle project, making sure to select *only one* variant
(otherwise things will likely break):

```kotlin
repositories {
    mavenCentral()
    // maven("https://s01.oss.sonatype.org/content/repositories/snapshots/") // for snapshot builds
}

dependencies {
    // to add the `dim2-f32` variant to your project
    implementation("io.github.aecsocket", "rapier-java-dim3-f32", "VERSION")
    // to add the `dim2-f32` variant's Linux `x86_64` native libraries to your JAR
    runtimeOnly("io.github.aecsocket", "rapier-java-dim3-f32-linux-x86", "VERSION")
    // you can also include multiple platform jars *for the same variant*
    runtimeOnly("io.github.aecsocket", "rapier-java-dim3-f32-windows-x86", "VERSION")
    runtimeOnly("io.github.aecsocket", "rapier-java-dim3-f32-macos-x86", "VERSION")
}
```

To get started with the library, you must load the Rapier shared library, either by:
- manually calling `System.load` or `System.loadLibrary` to load a `librapier_ffi` dll/so/dylib
- calling `Rapier.load` to load the libraries from a corresponding variant binary, like `rapier-java-dim3-f32-linux-x86`

Then use the library as you normally would.

Some notes on usage:
- The wrappers follow the Rapier API very closely, adopting Java conventions like `getX` and `setX` instead of
  `x` and `set_x`. All return values and parameters are non-null unless specified otherwise with a `@Nullable`
  annotation.
- Read the Rapier docs to understand how the Java methods work. They're basically 1-to-1 bindings.
- Note that even though a few safeguards are added, *memory management is up to you!* You can potentially
  crash and/or corrupt the state of not only Rapier but the entire JVM if you're not careful with memory and concurrency.
  - In particular, make sure to inspect the underlying Rapier methods to see if they take `&self` or `&mut self`, and
    obey that. For example, use a lock to protect the physics pipeline (and associated structs) while running a step
    (taking `&mut PhysicsPipeline`) to ensure that nothing else touches that state from another thread while Rapier
    is working.
- When making stack allocated variables, use `MemorySession` (TODO in Java 20: `Arena`) and `openConfined` to push
  some memory onto the stack, then you can use the `.of` and `.create` methods on value types to allocate and create
  them.
- When updating the `PhysicsPipeline` or `QueryPipeline` objects: if you have multiple pipelines to update at the
  same time, use `stepAll` or `updateAll` to update them in parallel. Internally this wraps them in a Rayon
  `ParallelIter` so they can potentially be worked on at the same time.
- As of `0.17.2`: There is currently a critical bug in Rapier [#445](https://github.com/dimforge/rapier/issues/445)
  which means you *should not* pass a `QueryPipeline` into `PhysicsPipeline.step`. This will end up corrupting the
  query pipeline's state over time, leading to **undiagnosable crashes and freezes on the JVM side!** (typically
  arond the `Qbvh::refit` method).
  - Instead, `update` the QueryPipeline manually.

See an example usage at [HelloRapier.java](src/test/java/rapier/HelloRapier.java).

Requirements:
- [Java 19 *exactly*](https://adoptium.net/temurin/releases/)
- `--enable-preview --enable-native-access=ALL-UNNAMED` command line flags when running the app

## Building

The architecture used in generating the bindings is somewhat weird, since we use `src/main/templates` to store templates
of Java code, then use the Pebble templating engine to generate individual variant source files. This means that
we only have to write one set of bindings, using variables like `__real` instead of `float` or `double`, which are
processed and replaced with their actual values in the individual variant sources. However, this means you will see
tons of IDE errors! Don't worry, you can inspect the actual sources generated by running `./gradlew generateTemplates`
and ensure they are error-free.

### Quick start

Requirements:
- [Java >=8](https://adoptium.net/temurin/releases/) to run the Gradle wrapper
- [Rust 2018 + Cargo](https://rustup.rs/)

Optional: if updating rapier_ffi, also:
- [cbindgen](https://github.com/mozilla/cbindgen)

```shell
git clone https://github.com/aecsocket/rapier-ffi
cd rapier-ffi/rapier-java
./gradlew build
```

To also publish to your local `~/.m2` repo:
```shell
./gradlew publishToMavenLocal
```

### Detailed steps

To update rapier_ffi:
1. `./gradlew generateHeaders`

    takes the [rapier-ffi/src](../rapier-ffi/src/) Rust sources and creates a C header file for FFI in
    [rapier-java-sys/build/librapier.h](rapier-java-sys/build/librapier.h)

2. `./gradlew generateSys`

    takes the C header file and creates Java sources for FFI in [rapier-java-sys/src](rapier-java-sys/src/) using
    [jextract](https://github.com/openjdk/jextract)

    **Note:** for this step, you need `jextract` on your machine to point to a JExtract version 19 binary

3. Modify the Java source templates in [src/main/templates](src/main/templates/)

4. `./gradlew generateTemplates`

    takes the template Java sources in [src/main/templates](src/main/templates/) and creates processed Java sources
    in the `rapier-java-dim*-f*` variant projects, using [the Pebble Templates engine](https://pebbletemplates.io/)
    and [a Gradle build script](build-logic/src/main/kotlin/templating/)

To generate native libraries:
1. `./gradlew assembleNatives`

    compiles [rapier-ffi/src](../rapier-ffi/src/) Rust sources to a platform-specific shared library into
    the `rapier-java-dim*-f*/platform-arch/build` directory

    Use the Gradle property `buildProfile` (via `-PbuildProfile=` on command line or `buildProfile=` in `gradle.properties`): 
    - `build/debug` for `dev` profile builds (default) - unoptimized, debug symbols
    - `build/release` for `release` profile builds (published to Maven central) - optimized

    These files are then copied (during the `assemble` step) into the `:rapier-java-natives-dim*-f*:platform-arch` project's JAR

To build the JAR and publish to your local Maven repo:
1. `./gradlew build`
    
    compiles the processed Java source files from the `:rapier-java-dim*-f*:platform-arch` variant projects into JARs

2. `./gradlew publishToMavenLocal`

    publishes all projects (including headers, variants, natives) to your local `~/.m2`
