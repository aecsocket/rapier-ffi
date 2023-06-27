use itertools::izip;
use rayon::prelude::{IntoParallelIterator, IntoParallelRefIterator, ParallelBridge};

use crate::prelude::*;

pub type RprSolverFlags = u32;

pub fn solver_flags_from(rpr: RprSolverFlags) -> SolverFlags {
    SolverFlags::from_bits(rpr).expect("invalid flags")
}

/// The constraint solver will take this contact manifold into
/// account for force computation.
pub const RprSolverFlags_COMPUTE_IMPULSES: RprSolverFlags = 0b001;

pub struct RprSolverContact(pub SolverContact);

#[no_mangle]
pub unsafe extern "C" fn RprSolverContact_point(this: *const RprSolverContact) -> RprVector {
    RprVector::from_point(this.get().0.point)
}

#[no_mangle]
pub unsafe extern "C" fn RprSolverContact_set_point(this: *mut RprSolverContact, value: RprVector) {
    this.get_mut().0.point = value.into_point()
}

#[no_mangle]
pub unsafe extern "C" fn RprSolverContact_dist(this: *const RprSolverContact) -> Real {
    this.get().0.dist
}

#[no_mangle]
pub unsafe extern "C" fn RprSolverContact_set_dist(this: *mut RprSolverContact, value: Real) {
    this.get_mut().0.dist = value
}

#[no_mangle]
pub unsafe extern "C" fn RprSolverContact_friction(this: *const RprSolverContact) -> Real {
    this.get().0.friction
}

#[no_mangle]
pub unsafe extern "C" fn RprSolverContact_set_friction(this: *mut RprSolverContact, value: Real) {
    this.get_mut().0.friction = value
}

#[no_mangle]
pub unsafe extern "C" fn RprSolverContact_restitution(this: *const RprSolverContact) -> Real {
    this.get().0.restitution
}

#[no_mangle]
pub unsafe extern "C" fn RprSolverContact_set_restitution(
    this: *mut RprSolverContact,
    value: Real,
) {
    this.get_mut().0.restitution = value
}

#[no_mangle]
pub unsafe extern "C" fn RprSolverContact_tangent_velocity(
    this: *const RprSolverContact,
) -> RprVector {
    RprVector::from_raw(this.get().0.tangent_velocity)
}

#[no_mangle]
pub unsafe extern "C" fn RprSolverContact_set_tangent_velocity(
    this: *mut RprSolverContact,
    value: RprVector,
) {
    this.get_mut().0.tangent_velocity = value.into_raw()
}

#[no_mangle]
pub unsafe extern "C" fn RprSolverContact_is_new(this: *const RprSolverContact) -> bool {
    this.get().0.is_new
}

#[no_mangle]
pub unsafe extern "C" fn RprSolverContact_is_bouncy(this: *const RprSolverContact) -> bool {
    this.get().0.is_bouncy()
}

pub struct RprContactData(pub TrackedContact<ContactData>);

#[no_mangle]
pub unsafe extern "C" fn RprContactData_local_p1(this: *const RprContactData) -> RprVector {
    RprVector::from_point(this.get().0.local_p1)
}

#[no_mangle]
pub unsafe extern "C" fn RprContactData_set_local_p1(this: *mut RprContactData, value: RprVector) {
    this.get_mut().0.local_p1 = value.into_point()
}

#[no_mangle]
pub unsafe extern "C" fn RprContactData_local_p2(this: *const RprContactData) -> RprVector {
    RprVector::from_point(this.get().0.local_p2)
}

#[no_mangle]
pub unsafe extern "C" fn RprContactData_set_local_p2(this: *mut RprContactData, value: RprVector) {
    this.get_mut().0.local_p2 = value.into_point()
}

#[no_mangle]
pub unsafe extern "C" fn RprContactData_dist(this: *const RprContactData) -> Real {
    this.get().0.dist
}

#[no_mangle]
pub unsafe extern "C" fn RprContactData_set_dist(this: *mut RprContactData, value: Real) {
    this.get_mut().0.dist = value
}

// TODO fid1, fid2

#[no_mangle]
pub unsafe extern "C" fn RprContactData_impulse(this: *const RprContactData) -> Real {
    this.get().0.data.impulse
}

#[no_mangle]
pub unsafe extern "C" fn RprContactData_set_impulse(this: *mut RprContactData, value: Real) {
    this.get_mut().0.data.impulse = value
}

#[no_mangle]
#[cfg(feature = "dim2")]
pub unsafe extern "C" fn RprContactData_tangent_impulse(
    this: *const RprContactData,
    out_x: *mut Real,
) {
    let t = this.get().0.data.tangent_impulse;
    *out_x = t;
}

#[no_mangle]
#[cfg(feature = "dim2")]
pub unsafe extern "C" fn RprContactData_set_tangent_impulse(this: *mut RprContactData, x: Real) {
    this.get_mut().0.data.tangent_impulse = x;
}

#[no_mangle]
#[cfg(feature = "dim3")]
pub unsafe extern "C" fn RprContactData_tangent_impulse(
    this: *const RprContactData,
    out_x: *mut Real,
    out_y: *mut Real,
) {
    let t = &this.get().0.data.tangent_impulse;
    *out_x = t.x;
    *out_y = t.y;
}

#[no_mangle]
#[cfg(feature = "dim3")]
pub unsafe extern "C" fn RprContactData_set_tangent_impulse(
    this: *mut RprContactData,
    x: Real,
    y: Real,
) {
    this.get_mut().0.data.tangent_impulse = rapier::na::Vector2::new(x, y);
}

pub struct RprContactManifold(pub ContactManifold);

#[no_mangle]
pub unsafe extern "C" fn RprContactManifold_points(
    this: *const RprContactManifold,
    out_data: *mut *const RprContactData,
    out_len: *mut usize,
) {
    let vec = &this.get().0.points;
    *out_data = vec.as_ptr() as *const TrackedContact<ContactData> as *const RprContactData;
    *out_len = vec.len();
}

#[no_mangle]
pub unsafe extern "C" fn RprContactManifold_local_n1(this: *const RprContactManifold) -> RprVector {
    RprVector::from_raw(this.get().0.local_n1)
}

#[no_mangle]
pub unsafe extern "C" fn RprContactManifold_local_n2(this: *const RprContactManifold) -> RprVector {
    RprVector::from_raw(this.get().0.local_n2)
}

#[no_mangle]
pub unsafe extern "C" fn RprContactManifold_subshape1(this: *const RprContactManifold) -> u32 {
    this.get().0.subshape1
}

#[no_mangle]
pub unsafe extern "C" fn RprContactManifold_subshape2(this: *const RprContactManifold) -> u32 {
    this.get().0.subshape2
}

#[no_mangle]
pub unsafe extern "C" fn RprContactManifold_subshape_pos1(
    this: *const RprContactManifold,
    out: *mut RprIsometry,
) -> bool {
    match this.get().0.subshape_pos1 {
        None => false,
        Some(t) => {
            *out = RprIsometry::from_raw(t);
            true
        }
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprContactManifold_subshape_pos2(
    this: *const RprContactManifold,
    out: *mut RprIsometry,
) -> bool {
    match this.get().0.subshape_pos2 {
        None => false,
        Some(t) => {
            *out = RprIsometry::from_raw(t);
            true
        }
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprContactManifold_rigid_body1(
    this: *const RprContactManifold,
    out: *mut RprRigidBodyHandle,
) -> bool {
    match this.get().0.data.rigid_body1 {
        None => false,
        Some(t) => {
            *out = RprRigidBodyHandle::from_raw(t.0);
            true
        }
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprContactManifold_rigid_body2(
    this: *const RprContactManifold,
    out: *mut RprRigidBodyHandle,
) -> bool {
    match this.get().0.data.rigid_body2 {
        None => false,
        Some(t) => {
            *out = RprRigidBodyHandle::from_raw(t.0);
            true
        }
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprContactManifold_solver_flags(
    this: *const RprContactManifold,
) -> RprSolverFlags {
    this.get().0.data.solver_flags.bits()
}

#[no_mangle]
pub unsafe extern "C" fn RprContactManifold_normal(this: *const RprContactManifold) -> RprVector {
    RprVector::from_raw(this.get().0.data.normal)
}

#[no_mangle]
pub unsafe extern "C" fn RprContactManifold_solver_contacts(
    this: *const RprContactManifold,
    out_data: *mut *const RprSolverContact,
    out_len: *mut usize,
) {
    let vec = &this.get().0.data.solver_contacts;
    *out_data = vec.as_ptr() as *const SolverContact as *const RprSolverContact;
    *out_len = vec.len();
}

#[no_mangle]
pub unsafe extern "C" fn RprContactManifold_relative_dominance(
    this: *const RprContactManifold,
) -> i16 {
    this.get().0.data.relative_dominance
}

#[no_mangle]
pub unsafe extern "C" fn RprContactManifold_user_data(this: *const RprContactManifold) -> u32 {
    this.get().0.data.user_data
}

pub struct RprContactModificationContext<'a>(pub ContactModificationContext<'a>);

#[no_mangle]
pub unsafe extern "C" fn RprContactModificationContext_bodies(
    this: *const RprContactModificationContext,
) -> *const RprRigidBodySet {
    this.get().0.bodies as *const RigidBodySet as *const RprRigidBodySet
}

#[no_mangle]
pub unsafe extern "C" fn RprContactModificationContext_colliders(
    this: *const RprContactModificationContext,
) -> *const RprColliderSet {
    this.get().0.colliders as *const ColliderSet as *const RprColliderSet
}

#[no_mangle]
pub unsafe extern "C" fn RprContactModificationContext_collider1(
    this: *const RprContactModificationContext,
) -> RprColliderHandle {
    RprColliderHandle::from_raw(this.get().0.collider1.0)
}

#[no_mangle]
pub unsafe extern "C" fn RprContactModificationContext_collider2(
    this: *const RprContactModificationContext,
) -> RprColliderHandle {
    RprColliderHandle::from_raw(this.get().0.collider2.0)
}

#[no_mangle]
pub unsafe extern "C" fn RprContactModificationContext_rigid_body1(
    this: *const RprContactModificationContext,
    out: *mut RprRigidBodyHandle,
) -> bool {
    match this.get().0.rigid_body1 {
        None => false,
        Some(t) => {
            *out = RprRigidBodyHandle::from_raw(t.0);
            true
        }
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprContactModificationContext_rigid_body2(
    this: *const RprContactModificationContext,
    out: *mut RprRigidBodyHandle,
) -> bool {
    match this.get().0.rigid_body2 {
        None => false,
        Some(t) => {
            *out = RprRigidBodyHandle::from_raw(t.0);
            true
        }
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprContactModificationContext_manifold(
    this: *const RprContactModificationContext,
) -> *const RprContactManifold {
    this.get().0.manifold as *const ContactManifold as *const RprContactManifold
}

#[no_mangle]
pub unsafe extern "C" fn RprContactModificationContext_solver_contacts(
    this: *const RprContactModificationContext,
    out_data: *mut *const RprSolverContact,
    out_len: *mut usize,
) {
    let vec = &this.get().0.solver_contacts;
    *out_data = vec.as_ptr() as *const SolverContact as *const RprSolverContact;
    *out_len = vec.len();
}

#[no_mangle]
pub unsafe extern "C" fn RprContactModificationContext_normal(
    this: *const RprContactModificationContext,
) -> RprVector {
    RprVector::from_raw(*this.get().0.normal)
}

#[no_mangle]
pub unsafe extern "C" fn RprContactModificationContext_set_normal(
    this: *mut RprContactModificationContext,
    value: RprVector,
) {
    *this.get_mut().0.normal = value.into_raw();
}

#[no_mangle]
pub unsafe extern "C" fn RprContactModificationContext_user_data(
    this: *const RprContactModificationContext,
) -> u32 {
    *this.get().0.user_data
}

#[no_mangle]
pub unsafe extern "C" fn RprContactModificationContext_set_user_data(
    this: *mut RprContactModificationContext,
    value: u32,
) {
    *this.get_mut().0.user_data = value
}

pub struct RprPairFilterContext<'a>(pub PairFilterContext<'a>);

#[no_mangle]
pub unsafe extern "C" fn RprPairFilterContext_bodies(
    this: *const RprPairFilterContext,
) -> *const RprRigidBodySet {
    this.get().0.bodies as *const RigidBodySet as *const RprRigidBodySet
}

#[no_mangle]
pub unsafe extern "C" fn RprPairFilterContext_colliders(
    this: *const RprPairFilterContext,
) -> *const RprColliderSet {
    this.get().0.colliders as *const ColliderSet as *const RprColliderSet
}

#[no_mangle]
pub unsafe extern "C" fn RprPairFilterContext_collider1(
    this: *const RprPairFilterContext,
) -> RprColliderHandle {
    RprColliderHandle::from_raw(this.get().0.collider1.0)
}

#[no_mangle]
pub unsafe extern "C" fn RprPairFilterContext_collider2(
    this: *const RprPairFilterContext,
) -> RprColliderHandle {
    RprColliderHandle::from_raw(this.get().0.collider2.0)
}

#[no_mangle]
pub unsafe extern "C" fn RprPairFilterContext_rigid_body1(
    this: *const RprPairFilterContext,
    out: *mut RprRigidBodyHandle,
) -> bool {
    match this.get().0.rigid_body1 {
        None => false,
        Some(t) => {
            *out = RprRigidBodyHandle::from_raw(t.0);
            true
        }
    }
}

#[no_mangle]
pub unsafe extern "C" fn RprPairFilterContext_rigid_body2(
    this: *const RprPairFilterContext,
    out: *mut RprRigidBodyHandle,
) -> bool {
    match this.get().0.rigid_body2 {
        None => false,
        Some(t) => {
            *out = RprRigidBodyHandle::from_raw(t.0);
            true
        }
    }
}

#[repr(C)]
pub struct RprPhysicsHooks {
    pub filter_contact_pair: extern "C" fn(context: *const RprPairFilterContext) -> RprSolverFlags,
    pub filter_intersection_pair: extern "C" fn(context: *const RprPairFilterContext) -> bool,
    pub modify_solver_contacts: extern "C" fn(context: *mut RprContactModificationContext),
}

impl PhysicsHooks for RprPhysicsHooks {
    fn filter_contact_pair(&self, context: &PairFilterContext) -> Option<SolverFlags> {
        match (self.filter_contact_pair)(
            context as *const PairFilterContext as *const RprPairFilterContext,
        ) {
            0 => None,
            t => Some(solver_flags_from(t)),
        }
    }

    fn filter_intersection_pair(&self, context: &PairFilterContext) -> bool {
        (self.filter_intersection_pair)(
            context as *const PairFilterContext as *const RprPairFilterContext,
        )
    }

    fn modify_solver_contacts(&self, context: &mut ContactModificationContext) {
        (self.modify_solver_contacts)(
            context as *mut ContactModificationContext as *mut RprContactModificationContext,
        )
    }
}

pub type RprCollisionEventFlags = u32;

pub fn collision_event_flags_from(rpr: RprCollisionEventFlags) -> CollisionEventFlags {
    CollisionEventFlags::from_bits(rpr).expect("invalid flags")
}

/// Flag set if at least one of the colliders involved in the
/// collision was a sensor when the event was fired.
pub const RprCollisionEventFlags_SENSOR: RprCollisionEventFlags = 0b0001;
/// Flag set if a `CollisionEvent::Stopped` was fired because
/// at least one of the colliders was removed.
pub const RprCollisionEventFlags_REMOVED: RprCollisionEventFlags = 0b0010;

#[repr(C)]
pub enum RprCollisionEvent {
    Started {
        coll1: RprColliderHandle,
        coll2: RprColliderHandle,
        flags: RprCollisionEventFlags,
    },
    Stopped {
        coll1: RprColliderHandle,
        coll2: RprColliderHandle,
        flags: RprCollisionEventFlags,
    },
}

impl RprCollisionEvent {
    pub fn from_raw(raw: CollisionEvent) -> Self {
        match raw {
            CollisionEvent::Started(coll1, coll2, flags) => Self::Started {
                coll1: RprColliderHandle::from_raw(coll1.0),
                coll2: RprColliderHandle::from_raw(coll2.0),
                flags: flags.bits(),
            },
            CollisionEvent::Stopped(coll1, coll2, flags) => Self::Stopped {
                coll1: RprColliderHandle::from_raw(coll1.0),
                coll2: RprColliderHandle::from_raw(coll2.0),
                flags: flags.bits(),
            },
        }
    }
}

pub struct RprContactPair(pub ContactPair);

#[no_mangle]
pub unsafe extern "C" fn RprContactPair_collider1(
    this: *const RprContactPair,
) -> RprColliderHandle {
    RprColliderHandle::from_raw(this.get().0.collider1.0)
}

#[no_mangle]
pub unsafe extern "C" fn RprContactPair_collider2(
    this: *const RprContactPair,
) -> RprColliderHandle {
    RprColliderHandle::from_raw(this.get().0.collider2.0)
}

#[no_mangle]
pub unsafe extern "C" fn RprContactPair_manifolds(
    this: *const RprContactPair,
    out_data: *mut *const RprContactManifold,
    out_len: *mut usize,
) {
    let vec = &this.get().0.manifolds;
    *out_data = vec.as_ptr() as *const ContactManifold as *const RprContactManifold;
    *out_len = vec.len();
}

#[no_mangle]
pub unsafe extern "C" fn RprContactPair_has_any_active_contact(
    this: *const RprContactPair,
) -> bool {
    this.get().0.has_any_active_contact
}

#[repr(C)]
pub struct RprEventHandler {
    pub handle_collision_event: extern "C" fn(
        bodies: *const RprRigidBodySet,
        colliders: *const RprColliderSet,
        event: RprCollisionEvent,
        contact_pair: *const RprContactPair,
    ),
    pub handle_contact_force_event: extern "C" fn(
        dt: Real,
        bodies: *const RprRigidBodySet,
        colliders: *const RprColliderSet,
        contact_pair: *const RprContactPair,
        total_force_magnitude: Real,
    ),
}

impl EventHandler for RprEventHandler {
    fn handle_collision_event(
        &self,
        bodies: &RigidBodySet,
        colliders: &ColliderSet,
        event: CollisionEvent,
        contact_pair: Option<&ContactPair>,
    ) {
        (self.handle_collision_event)(
            bodies as *const RigidBodySet as *const RprRigidBodySet,
            colliders as *const ColliderSet as *const RprColliderSet,
            RprCollisionEvent::from_raw(event),
            match contact_pair {
                None => std::ptr::null(),
                Some(t) => t as *const ContactPair as *const RprContactPair,
            },
        )
    }

    fn handle_contact_force_event(
        &self,
        dt: Real,
        bodies: &RigidBodySet,
        colliders: &ColliderSet,
        contact_pair: &ContactPair,
        total_force_magnitude: Real,
    ) {
        (self.handle_contact_force_event)(
            dt,
            bodies as *const RigidBodySet as *const RprRigidBodySet,
            colliders as *const ColliderSet as *const RprColliderSet,
            contact_pair as *const ContactPair as *const RprContactPair,
            total_force_magnitude,
        )
    }
}

pub struct RprPhysicsPipeline(pub PhysicsPipeline);

#[no_mangle]
pub extern "C" fn RprPhysicsPipeline_new() -> *mut RprPhysicsPipeline {
    leak_ptr(RprPhysicsPipeline(PhysicsPipeline::new()))
}

#[no_mangle]
pub unsafe extern "C" fn RprPhysicsPipeline_drop(this: *mut RprPhysicsPipeline) {
    drop_ptr(this)
}

#[no_mangle]
pub unsafe extern "C" fn RprPhysicsPipeline_step(
    this: *mut RprPhysicsPipeline,
    gravity: RprVector,
    integration_parameters: *const RprIntegrationParameters,
    islands: *mut RprIslandManager,
    broad_phase: *mut RprBroadPhase,
    narrow_phase: *mut RprNarrowPhase,
    bodies: *mut RprRigidBodySet,
    colliders: *mut RprColliderSet,
    impulse_joints: *mut RprImpulseJointSet,
    multibody_joints: *mut RprMultibodyJointSet,
    ccd_solver: *mut RprCCDSolver,
    query_pipeline: *mut RprQueryPipeline,
    hooks: *const RprPhysicsHooks,
    events: *const RprEventHandler,
) {
    let hooks: &dyn PhysicsHooks = match hooks.as_ref() {
        None => &(),
        Some(t) => t,
    };
    let events: &dyn EventHandler = match events.as_ref() {
        None => &(),
        Some(t) => t,
    };

    this.get_mut().0.step(
        &gravity.into_raw(),
        &integration_parameters.get().0,
        &mut islands.get_mut().0,
        &mut broad_phase.get_mut().0,
        &mut narrow_phase.get_mut().0,
        &mut bodies.get_mut().0,
        &mut colliders.get_mut().0,
        &mut impulse_joints.get_mut().0,
        &mut multibody_joints.get_mut().0,
        &mut ccd_solver.get_mut().0,
        query_pipeline.as_mut().map(|t| &mut t.0),
        hooks,
        events,
    )
}

/// cbindgen:ptrs-as-arrays=[[pipeline;], [gravity;], [integration_parameters;], [islands;], [broad_phase;], [narrow_phase;], [bodies;], [colliders;], [impulse_joints;], [multibody_joints;], [ccd_solver;], [query_pipeline;], [hooks;], [events;]]
#[no_mangle]
pub unsafe extern "C" fn RprPhysicsPipeline_step_all(
    len: usize,
    pipeline: *const *mut RprPhysicsPipeline,
    gravity: *const RprVector,
    integration_parameters: *const *const RprIntegrationParameters,
    islands: *const *mut RprIslandManager,
    broad_phase: *const *mut RprBroadPhase,
    narrow_phase: *const *mut RprNarrowPhase,
    bodies: *const *mut RprRigidBodySet,
    colliders: *const *mut RprColliderSet,
    impulse_joints: *const *mut RprImpulseJointSet,
    multibody_joints: *const *mut RprMultibodyJointSet,
    ccd_solver: *const *mut RprCCDSolver,
    query_pipeline: *const *mut RprQueryPipeline,
    hooks: *const *const RprPhysicsHooks,
    events: *const *const RprEventHandler,
) {
    let pipeline = std::slice::from_raw_parts(pipeline, len);
    let gravity = std::slice::from_raw_parts(gravity, len);
    let integration_parameters = std::slice::from_raw_parts(integration_parameters, len);
    let islands = std::slice::from_raw_parts(islands, len);
    let broad_phase = std::slice::from_raw_parts(broad_phase, len);
    let narrow_phase = std::slice::from_raw_parts(narrow_phase, len);
    let bodies = std::slice::from_raw_parts(bodies, len);
    let colliders = std::slice::from_raw_parts(colliders, len);
    let impulse_joints = std::slice::from_raw_parts(impulse_joints, len);
    let multibody_joints = std::slice::from_raw_parts(multibody_joints, len);
    let ccd_solver = std::slice::from_raw_parts(ccd_solver, len);
    let query_pipeline = std::slice::from_raw_parts(query_pipeline, len);
    let hooks = std::slice::from_raw_parts(hooks, len);
    let events = std::slice::from_raw_parts(events, len);

    for (
        pipeline,
        gravity,
        integration_parameters,
        islands,
        broad_phase,
        narrow_phase,
        bodies,
        colliders,
        impulse_joints,
        multibody_joints,
        ccd_solver,
        query_pipeline,
        hooks,
        events,
    ) in izip!(
        pipeline,
        gravity,
        integration_parameters,
        islands,
        broad_phase,
        narrow_phase,
        bodies,
        colliders,
        impulse_joints,
        multibody_joints,
        ccd_solver,
        query_pipeline,
        hooks,
        events,
    ) {
        let query_pipeline: Option<&mut QueryPipeline> = query_pipeline.as_mut().map(|t| &mut (*t).0);
        let hooks: &dyn PhysicsHooks = match hooks.as_ref() {
            None => &(),
            Some(t) => t,
        };
        let events: &dyn EventHandler = match events.as_ref() {
            None => &(),
            Some(t) => t,
        };
        (*pipeline).get_mut().0.step(
            &gravity.into_raw(),
            &(*integration_parameters).get().0,
            &mut (*islands).get_mut().0,
            &mut (*broad_phase).get_mut().0,
            &mut (*narrow_phase).get_mut().0,
            &mut (*bodies).get_mut().0,
            &mut (*colliders).get_mut().0,
            &mut (*impulse_joints).get_mut().0,
            &mut (*multibody_joints).get_mut().0,
            &mut (*ccd_solver).get_mut().0,
            query_pipeline,
            hooks,
            events,
        )
    }
}
