use crate::prelude::*;

pub struct RprIntegrationParameters(pub IntegrationParameters);

#[no_mangle]
pub extern "C" fn RprIntegrationParameters_default() -> *mut RprIntegrationParameters {
    leak_ptr(RprIntegrationParameters(IntegrationParameters::default()))
}

#[no_mangle]
pub unsafe extern "C" fn RprIntegrationParameters_drop(this: *mut RprIntegrationParameters) {
    drop_ptr(this)
}

#[no_mangle]
pub unsafe extern "C" fn RprIntegrationParameters_dt(
    this: *mut RprIntegrationParameters,
) -> *mut Real {
    &mut this.get_mut().0.dt
}
