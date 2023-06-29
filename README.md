<div align="center">

# rapier-ffi
[![CI](https://img.shields.io/github/actions/workflow/status/aecsocket/rapier-ffi/build-ffi.yml)](https://github.com/aecsocket/rapier-ffi/actions/workflows/build-ffi.yml)

FFI bindings for the [Rapier](https://github.com/dimforge/rapier/) physics engine

### [GitHub](https://github.com/aecsocket/rapier-ffi)

</div>

This repository provides bindings for the Rapier physics engine to various languages, including:
- [C → rapier-ffi](rapier-ffi/)
- [Java → rapier-java → rapier-ffi](rapier-java/)

Visit the individual subproject's README to see more details.

This repository is dual-licensed Apache and MIT. This license applies to all subprojects.

## Coverage

- [x] Shapes
  - [x] Primitive convexes
  - [x] Compound
  - [x] Polylines, convex hulls, meshes, decomposition
  - [x] Heightfield
- [x] Rigid bodies and colliders
  - [x] Shape
  - [x] Position
  - [x] Interaction groups
  - [x] Mass properties
- [x] Pipelines
  - [x] Physics
  - [x] Query
- [ ] Joints
  - [x] Generic data
  - [x] Impulse
  - [ ] Multibody
- [ ] Controllers
  - [ ] Character
  - [ ] Vehicle
