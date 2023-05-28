use itertools::izip;

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
) {
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
        // TODO
        &(),
        &(),
    )
}

/// cbindgen:ptrs-as-arrays=[[pipeline;], [gravity;], [integration_parameters;], [islands;], [broad_phase;], [narrow_phase;], [bodies;], [colliders;], [impulse_joints;], [multibody_joints;], [ccd_solver;], [query_pipeline;]]
#[no_mangle]
pub unsafe extern "C" fn RprPhysicsPipeline_step_all(
    count: usize,
    pipeline: *mut *mut RprPhysicsPipeline,
    gravity: *const RprVector,
    integration_parameters: *const *const RprIntegrationParameters,
    islands: *mut *mut RprIslandManager,
    broad_phase: *mut *mut RprBroadPhase,
    narrow_phase: *mut *mut RprNarrowPhase,
    bodies: *mut *mut RprRigidBodySet,
    colliders: *mut *mut RprColliderSet,
    impulse_joints: *mut *mut RprImpulseJointSet,
    multibody_joints: *mut *mut RprMultibodyJointSet,
    ccd_solver: *mut *mut RprCCDSolver,
    query_pipeline: *mut *mut RprQueryPipeline,
) {
    let pipeline = std::slice::from_raw_parts_mut(pipeline, count);
    let gravity = std::slice::from_raw_parts(gravity, count);
    let integration_parameters = std::slice::from_raw_parts(integration_parameters, count);
    let islands = std::slice::from_raw_parts_mut(islands, count);
    let broad_phase = std::slice::from_raw_parts_mut(broad_phase, count);
    let narrow_phase = std::slice::from_raw_parts_mut(narrow_phase, count);
    let bodies = std::slice::from_raw_parts_mut(bodies, count);
    let colliders = std::slice::from_raw_parts_mut(colliders, count);
    let impulse_joints = std::slice::from_raw_parts_mut(impulse_joints, count);
    let multibody_joints = std::slice::from_raw_parts_mut(multibody_joints, count);
    let ccd_solver = std::slice::from_raw_parts_mut(ccd_solver, count);
    let query_pipeline = std::slice::from_raw_parts_mut(query_pipeline, count);

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
        query_pipeline
    ) {
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
            Some(&mut (*query_pipeline).get_mut().0),
            // TODO
            &(),
            &(),
        )
    }
}
