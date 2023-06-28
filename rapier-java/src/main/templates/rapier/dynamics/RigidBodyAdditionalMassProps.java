package rapier.dynamics;

import rapier.data.ArenaKey;
import rapier.sys.RprCollisionEvent;
import rapier.sys.RprCollisionEvent_Started_Body;
import rapier.sys.RprCollisionEvent_Stopped_Body;
import rapier.sys.RprRigidBodyAdditionalMassProps;

import java.lang.foreign.MemorySegment;

public sealed interface RigidBodyAdditionalMassProps {
    record MassProps(MassProperties props) implements RigidBodyAdditionalMassProps {}

    record Mass({{ real }} mass) implements RigidBodyAdditionalMassProps {}

//    static RigidBodyAdditionalMassProps from(MemorySegment memory) {
//        var tag = RprRigidBodyAdditionalMassProps.tag$get(memory);
//        return switch (tag) {
//            case 0 -> {
//                var body = RprRigidBodyAdditionalMassProps.mass_props$slice(memory);
//                yield new MassProps(
//                        MassProperties.from(RprRigidBodyAdditionalMassProps)
//                        ArenaKey.pack(RprCollisionEvent_Started_Body.coll1$slice(body)),
//                        ArenaKey.pack(RprCollisionEvent_Started_Body.coll2$slice(body)),
//                        RprCollisionEvent_Started_Body.flags$get(body)
//                );
//            }
//            case 1 -> {
//                var body = RprCollisionEvent.stopped$slice(memory);
//                yield new Stopped(
//                        ArenaKey.pack(RprCollisionEvent_Stopped_Body.coll1$slice(body)),
//                        ArenaKey.pack(RprCollisionEvent_Stopped_Body.coll2$slice(body)),
//                        RprCollisionEvent_Stopped_Body.flags$get(body)
//                );
//            }
//            default -> throw new IllegalArgumentException("Invalid tag " + tag);
//        };
//    }
}
