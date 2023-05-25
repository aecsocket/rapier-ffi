use rapier::data::Index;

use crate::prelude::*;

#[repr(C)]
#[derive(Debug, Clone, Copy)]
pub struct RprArenaKey {
    pub index: u32,
    pub generation: u32,
}

impl RprArenaKey {
    pub fn from_raw(handle: Index) -> Self {
        let (index, generation) = handle.into_raw_parts();
        Self { index, generation }
    }

    pub fn invalid() -> Self {
        Self {
            index: INVALID_U32,
            generation: INVALID_U32,
        }
    }

    pub fn is_valid(self) -> bool {
        self.index != INVALID_U32 || self.generation != INVALID_U32
    }

    pub fn into_raw(self) -> Index {
        Index::from_raw_parts(self.index, self.generation)
    }

    pub fn none_if_invalid(self) -> Option<Index> {
        match self {
            RprArenaKey {
                index: INVALID_U32,
                generation: INVALID_U32,
            } => None,
            t => Some(t.into_raw()),
        }
    }
}

#[no_mangle]
pub extern "C" fn RprArenaKey_invalid() -> RprArenaKey {
    RprArenaKey::invalid()
}
