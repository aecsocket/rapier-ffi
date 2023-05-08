use crate::prelude::*;

pub struct RprPhysicsPipeline(pub PhysicsPipeline);

#[no_mangle]
pub extern "C" fn RprPhysicsPipeline_new() -> *mut RprPhysicsPipeline {
    leak_ptr(RprPhysicsPipeline(PhysicsPipeline::new()))
}

#[no_mangle]
pub unsafe extern "C" fn RprPhysicsPipeline_drop(this: *mut RprPhysicsPipeline) {
    drop_ptr(this)
}

/// cbindgen:ptrs-as-arrays=[[gravity; 2]]
#[no_mangle]
#[cfg(feature = "dim2")]
pub unsafe extern "C" fn RprPhysicsPipeline_step(
    this: *mut RprPhysicsPipeline,
    gravity: *const RprReal,
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
) {
    this.get_mut().0.step(
        &read_rvec(gravity),
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
        // TODO
        &(),
        &(),
    )
}

/// cbindgen:ptrs-as-arrays=[[gravity; 3]]
#[no_mangle]
#[cfg(feature = "dim3")]
pub unsafe extern "C" fn RprPhysicsPipeline_step(
    this: *mut RprPhysicsPipeline,
    gravity: *const RprReal,
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
) {
    this.get_mut().0.step(
        &read_rvec(gravity),
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
        // TODO
        &(),
        &(),
    )
}
