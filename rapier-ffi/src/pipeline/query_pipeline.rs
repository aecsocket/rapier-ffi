use crate::prelude::*;

pub struct RprQueryPipeline(pub QueryPipeline);

#[no_mangle]
pub extern "C" fn RprQueryPipeline_new() -> *mut RprQueryPipeline {
    leak_ptr(RprQueryPipeline(QueryPipeline::new()))
}

#[no_mangle]
pub unsafe extern "C" fn RprQueryPipeline_drop(this: *mut RprQueryPipeline) {
    drop_ptr(this)
}
