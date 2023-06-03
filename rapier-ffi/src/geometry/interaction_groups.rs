use crate::prelude::*;

pub type RprGroup = u32;

pub fn group_from(rpr: RprGroup) -> Group {
    Group::from_bits(rpr).expect("invalid flags")
}

#[repr(C)]
#[derive(Debug, Clone, Copy)]
pub struct RprInteractionGroups {
    pub memberships: RprGroup,
    pub filter: RprGroup,
}

impl RprInteractionGroups {
    pub fn from_raw(raw: InteractionGroups) -> Self {
        Self {
            memberships: raw.memberships.bits(),
            filter: raw.filter.bits(),
        }
    }

    pub fn into_raw(self) -> InteractionGroups {
        InteractionGroups {
            memberships: group_from(self.memberships),
            filter: group_from(self.filter),
        }
    }
}
