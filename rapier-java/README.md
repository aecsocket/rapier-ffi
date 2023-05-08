<div align="center">

# rapier-java
[![CI](https://img.shields.io/github/actions/workflow/status/aecsocket/rapier-java/build.yml)](https://github.com/aecsocket/rapier-java/actions/workflows/build.yml)

Java bindings for the Rapier physics engine

### [GitHub](https://github.com/aecsocket/rapier-java)

</div>

## Building

### Quick start

Requirements:
* [Java 20](https://openjdk.org/projects/jdk/20/)
* [Rust 2018 + Cargo](https://rustup.rs/)

Optional: if updating rapier_ffi, also:
* [cbindgen](https://github.com/mozilla/cbindgen)

```shell
git clone https://github.com/aecsocket/rapier-java
cd rapier-java
git submodule update --init
./gradlew build
```

To also publish to your local `~/.m2` repo:
```shell
./gradlew publishToMavenLocal
```

### Detailed steps

To update rapier_ffi:
1. `./gradlew generateHeaders`

    takes the [rapier_ffi/src](rapier_ffi/src) Rust sources and creates a C header file for FFI in
    [rapier-java-sys/build/librapier.h](rapier-java-sys/build/librapier.h)

2. `./gradlew generateSys`

    takes the C header file and creates Java sources for FFI in [rapier-java-sys/src](rapier-java-sys/src) using
    [jextract](https://github.com/openjdk/jextract)

3. Modify the Java source templates in [src/main/templates](src/main/templates)

4. `./gradlew generateTemplates`

    takes the template Java sources in [src/main/templates](src/main/templates) and creates processed Java sources
    in the `rapier-java-dim*-f*` variant projects, using [the Pebble Templates engine](https://pebbletemplates.io/)
    and [a Gradle build script](build-logic/src/main/kotlin/templating)

To generate native libraries:
1. `./gradlew assembleNatives`

    compiles [rapier_ffi/src](rapier_ffi/src) Rust sources to a platform-specific shared library in
    [rapier_ffi/target](rapier_ffi/target)
    - `target/debug` for `dev` profile builds (default)
    - `target/release` for `release` profile builds (published to Maven central)
    These files are then copied (during the `assemble` step) into the `rapier-java-natives-*` project's JAR

To build the JAR and publish to your local Maven repo:
1. `./gradlew build`
    
    compiles the processed Java source files from the `rapier-java-dim*-f*` variant projects into JARs

2. `./gradlew publishToMavenLocal`

    publishes all projects (including headers, variants, natives) to your local `~/.m2`
