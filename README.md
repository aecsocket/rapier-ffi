<div align="center">

# rapier_ffi
[![CI](https://img.shields.io/github/actions/workflow/status/aecsocket/rapier-ffi/build.yml)](https://github.com/aecsocket/rapier-ffi/actions/workflows/build.yml)

C/FFI bindings for the [Rapier](https://github.com/dimforge/rapier/) physics engine

### [GitHub](https://github.com/aecsocket/rapier-ffi)

</div>

`rapier_ffi` is a crate providing binding code, written in Rust, to allow C code to interface with Rapier.
These C bindings can also be extended to other languages like Java, in [rapier-java](https://github.com/aecsocket/rapier-java/).

The project supports different variants of the engine by activating one (only one!) of these features:
 - `dim2-f32`
 - `dim2-f64`
 - `dim3-f32`
 - `dim3-f64`
