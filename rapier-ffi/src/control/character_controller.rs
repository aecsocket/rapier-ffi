use crate::prelude::*;

/// A length measure used for various options of a character controller.
#[repr(C)]
#[derive(Clone, Copy, Debug)]
pub enum RprCharacterLength {
    /// The length is specified relative to some of the character shape’s size.
    ///
    /// For example setting `CharacterAutostep::max_height` to `CharacterLength::Relative(0.1)`
    /// for a shape with an height equal to 20.0 will result in a maximum step height
    /// of `0.1 * 20.0 = 2.0`.
    Relative(Real),
    /// The length is specified as an aboslute value, independent from the character shape’s size.
    ///
    /// For example setting `CharacterAutostep::max_height` to `CharacterLength::Relative(0.1)`
    /// for a shape with an height equal to 20.0 will result in a maximum step height
    /// of `0.1` (the shape height is ignored in for this value).
    Absolute(Real),
}

impl RprCharacterLength {
    pub fn from_raw(raw: CharacterLength) -> Self {
        match raw {
            CharacterLength::Relative(r) => Self::Relative(r),
            CharacterLength::Absolute(r) => Self::Absolute(r),
        }
    }

    pub fn into_raw(self) -> CharacterLength {
        match self {
            Self::Relative(r) => CharacterLength::Relative(r),
            Self::Absolute(r) => CharacterLength::Absolute(r),
        }
    }
}

/// Configuration for the auto-stepping character controller feature.
#[repr(C)]
#[derive(Clone, Copy, Debug)]
pub struct RprCharacterAutostep {
    /// The maximum step height a character can automatically step over.
    pub max_height: RprCharacterLength,
    /// The minimum width of free space that must be available after stepping on a stair.
    pub min_width: RprCharacterLength,
    /// Can the character automatically step over dynamic bodies too?
    pub include_dynamic_bodies: bool,
}

impl RprCharacterAutostep {
    pub fn from_raw(raw: CharacterAutostep) -> Self {
        Self {
            max_height: RprCharacterLength::from_raw(raw.max_height),
            min_width: RprCharacterLength::from_raw(raw.min_width),
            include_dynamic_bodies: raw.include_dynamic_bodies,
        }
    }

    pub fn into_raw(self) -> CharacterAutostep {
        CharacterAutostep {
            max_height: self.max_height.into_raw(),
            min_width: self.min_width.into_raw(),
            include_dynamic_bodies: self.include_dynamic_bodies,
        }
    }
}

/// A collision between the character and its environment during its movement.
#[repr(C)]
#[derive(Clone, Copy, Debug)]
pub struct RprCharacterCollision {
    /// The collider hit by the character.
    pub handle: RprColliderHandle,
    /// The position of the character when the collider was hit.
    pub character_pos: RprIsometry,
    /// The translation that was already applied to the character when the hit happens.
    pub translation_applied: RprVector,
    /// The translations that was still waiting to be applied to the character when the hit happens.
    pub translation_remaining: RprVector,
    /// Geometric information about the hit.
    pub toi: RprTOI,
}

impl RprCharacterCollision {
    pub fn from_raw(raw: CharacterCollision) -> Self {
        Self {
            handle: RprColliderHandle::from_raw(raw.handle.0),
            character_pos: RprIsometry::from_raw(raw.character_pos),
            translation_applied: RprVector::from_raw(raw.translation_applied),
            translation_remaining: RprVector::from_raw(raw.translation_remaining),
            toi: RprTOI::from_raw(raw.toi),
        }
    }

    pub fn into_raw(self) -> CharacterCollision {
        CharacterCollision {
            handle: ColliderHandle(self.handle.into_raw()),
            character_pos: self.character_pos.into_raw(),
            translation_applied: self.translation_applied.into_raw(),
            translation_remaining: self.translation_remaining.into_raw(),
            toi: self.toi.into_raw(),
        }
    }
}

/// The effective movement computed by the character controller.
#[repr(C)]
#[derive(Clone, Copy, Debug)]
pub struct RprEffectiveCharacterMovement {
    /// The movement to apply.
    pub translation: RprVector,
    /// Is the character touching the ground after applying `EffectiveKineamticMovement::translation`?
    pub grounded: bool,
}

impl RprEffectiveCharacterMovement {
    pub fn from_raw(raw: EffectiveCharacterMovement) -> Self {
        Self {
            translation: RprVector::from_raw(raw.translation),
            grounded: raw.grounded,
        }
    }

    pub fn into_raw(self) -> EffectiveCharacterMovement {
        EffectiveCharacterMovement {
            translation: self.translation.into_raw(),
            grounded: self.grounded,
        }
    }
}

pub struct RprKinematicCharacterController(pub KinematicCharacterController);

#[no_mangle]
pub extern "C" fn RprKinematicCharacterController_default() -> *mut RprKinematicCharacterController {
    leak_ptr(RprKinematicCharacterController(KinematicCharacterController::default()))
}

#[no_mangle]
pub unsafe extern "C" fn RprKinematicCharacterController_up(
    this: *const RprKinematicCharacterController,
) -> RprVector {
    RprVector::from_raw(*this.get().0.up)
}

#[no_mangle]
pub unsafe extern "C" fn RprKinematicCharacterController_set_up(
    this: *mut RprKinematicCharacterController,
    value: RprVector,
) {
    this.get_mut().0.up = value.into_unit()
}

#[no_mangle]
pub unsafe extern "C" fn RprKinematicCharacterController_offset(
    this: *const RprKinematicCharacterController,
) -> RprCharacterLength {
    RprCharacterLength::from_raw(this.get().0.offset)
}

#[no_mangle]
pub unsafe extern "C" fn RprKinematicCharacterController_set_offset(
    this: *mut RprKinematicCharacterController,
    value: RprCharacterLength,
) {
    this.get_mut().0.offset = value.into_raw()
}

#[no_mangle]
pub unsafe extern "C" fn RprKinematicCharacterController_slide(
    this: *const RprKinematicCharacterController,
) -> bool {
    this.get().0.slide
}

#[no_mangle]
pub unsafe extern "C" fn RprKinematicCharacterController_set_slide(
    this: *mut RprKinematicCharacterController,
    value: bool,
) {
    this.get_mut().0.slide = value
}

#[no_mangle]
pub unsafe extern "C" fn RprKinematicCharacterController_autostep(
    this: *const RprKinematicCharacterController,
    out: *mut RprCharacterAutostep,
) -> bool {
    match this.get().0.autostep {
        Some(t) => {
            *out = RprCharacterAutostep::from_raw(t);
            true
        }
        None => false,
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprKinematicCharacterController_set_autostep(
    this: *mut RprKinematicCharacterController,
    value: RprCharacterAutostep,
) {
    this.get_mut().0.autostep = Some(value.into_raw())
}

#[no_mangle]
pub unsafe extern "C" fn RprKinematicCharacterController_clear_autostep(
    this: *mut RprKinematicCharacterController,
) {
    this.get_mut().0.autostep = None
}

#[no_mangle]
pub unsafe extern "C" fn RprKinematicCharacterController_max_slope_climb_angle(
    this: *const RprKinematicCharacterController,
) -> Real {
    this.get().0.max_slope_climb_angle
}

#[no_mangle]
pub unsafe extern "C" fn RprKinematicCharacterController_set_max_slope_climb_angle(
    this: *mut RprKinematicCharacterController,
    value: Real,
) {
    this.get_mut().0.max_slope_climb_angle = value
}

#[no_mangle]
pub unsafe extern "C" fn RprKinematicCharacterController_min_slope_slide_angle(
    this: *const RprKinematicCharacterController,
) -> Real {
    this.get().0.min_slope_slide_angle
}

#[no_mangle]
pub unsafe extern "C" fn RprKinematicCharacterController_set_min_slope_slide_angle(
    this: *mut RprKinematicCharacterController,
    value: Real,
) {
    this.get_mut().0.min_slope_slide_angle = value
}

#[no_mangle]
pub unsafe extern "C" fn RprKinematicCharacterController_snap_to_ground(
    this: *const RprKinematicCharacterController,
    out: *mut RprCharacterLength,
) -> bool {
    match this.get().0.snap_to_ground {
        Some(t) => {
            *out = RprCharacterLength::from_raw(t);
            true
        }
        None => false,
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprKinematicCharacterController_set_snap_to_ground(
    this: *mut RprKinematicCharacterController,
    value: RprCharacterLength,
) {
    this.get_mut().0.snap_to_ground = Some(value.into_raw())
}

#[no_mangle]
pub unsafe extern "C" fn RprKinematicCharacterController_clear_snap_to_ground(
    this: *mut RprKinematicCharacterController,
) {
    this.get_mut().0.snap_to_ground = None
}

#[no_mangle]
pub unsafe extern "C" fn RprKinematicCharacterController_move_shape(
    this: *const RprKinematicCharacterController,
    dt: Real,
    bodies: *const RprRigidBodySet,
    colliders: *const RprColliderSet,
    queries: *const RprQueryPipeline,
    character_shape: *const RprSharedShape,
    character_pos: RprIsometry,
    desired_translation: RprVector,
    filter: RprQueryFilter,
    events: *const extern "C" fn(RprCharacterCollision),
) -> RprEffectiveCharacterMovement {
    let predicate = filter.predicate();
    RprEffectiveCharacterMovement::from_raw(this.get().0.move_shape(
        dt,
        &bodies.get().0,
        &colliders.get().0,
        &queries.get().0,
        character_shape.get().0.0.as_ref(),
        &character_pos.into_raw(),
        desired_translation.into_raw(),
        filter.into_raw(&predicate),
        |coll| (*events)(RprCharacterCollision::from_raw(coll)),
    ))
}

#[no_mangle]
pub unsafe extern "C" fn RprKinematicCharacterController_solve_character_collision_impulses(
    this: *const RprKinematicCharacterController,
    dt: Real,
    bodies: *mut RprRigidBodySet,
    colliders: *const RprColliderSet,
    queries: *const RprQueryPipeline,
    character_shape: *const RprSharedShape,
    character_mass: Real,
    collision: RprCharacterCollision,
    filter: RprQueryFilter,
) {
    let predicate = filter.predicate();
    this.get().0.solve_character_collision_impulses(
        dt,
        &mut bodies.get_mut().0,
        &colliders.get().0,
        &queries.get().0,
        character_shape.get().0.0.as_ref(),
        character_mass,
        &collision.into_raw(),
        filter.into_raw(&predicate),
    )
}
