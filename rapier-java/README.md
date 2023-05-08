# Building

## Quick start

```shell
git clone https://github.com/aecsocket/rapier-java
cd rapier-java
git submodule init
./gradlew build
```

To also publish to your local `~/.m2` repo:
```shell
./gradlew publishToMavenLocal
```

## Detailed steps

To update rapier_ffi:
1. `./gradlew generateHeaders`

    takes the [rapier_ffi/src](rapier_ffi/src) Rust sources and creates a C header file for FFI in
    [rapier_ffi/target/librapier.h](rapier_ffi/target/librapier.h)

2. `./gradlew generateSys`

    takes the C header file and creates Java sources for FFI in [rapier-java-sys/src](rapier-java-sys/src) using
    [jextract](https://github.com/openjdk/jextract)

3. `./gradlew generateTemplates`

    takes the template Java sources in [src/main/templates](src/main/templates) and generates processed Java sources
    in the `rapier-java-dim*-f*` variant projects, using [the Pebble Templates engine](https://pebbletemplates.io/)
    and [a Gradle build script](build-logic/src/main/kotlin/templating)

To generate native libraries:
1. `./gradlew assembleNatives`

    compiles [rapier_ffi/src](rapier_ffi/src) Rust sources to a platform-specific shared library in
    [rapier_ffi/target](rapier_ffi/target)
    - `target/debug` for debug builds
    - `target/release` for release builds (default, this gets published to Maven central)

To build the JAR and publish to your local Maven repo:
1. `./gradlew build`
    
    compiles the processed Java source files from the `rapier-java-dim*-f*` variant projects into JARs

2. `./gradlew publishToMavenLocal`

    publishes all projects (including headers, variants, natives) to your local `~/.m2`
