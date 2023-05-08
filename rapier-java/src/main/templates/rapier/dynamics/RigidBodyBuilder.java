package rapier.dynamics;

import rapier.DroppableNative;
import rapier.math.Vector3;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class RigidBodyBuilder extends DroppableNative {
    protected RigidBodyBuilder(MemorySegment memory) {
        super(memory);
    }

    public static RigidBodyBuilder at(MemorySegment memory) {
        return new RigidBodyBuilder(memory);
    }

    public static RigidBodyBuilder fixed() {
        return RigidBodyBuilder.at(RprRigidBodyBuilder_fixed());
    }

    public static RigidBodyBuilder dynamic() {
        return RigidBodyBuilder.at(RprRigidBodyBuilder_dynamic());
    }

    @Override
    protected void dropInternal() {
        RprRigidBodyBuilder_drop(self);
    }

    public RigidBody build() {
        return RigidBody.at(RprRigidBodyBuilder_build(self));
    }

    public RigidBodyBuilder translation({{ realVector }} translation) {
        {{ sys }}.RapierC.RprRigidBodyBuilder_translation(self, translation.memory());
        return this;
    }
}
