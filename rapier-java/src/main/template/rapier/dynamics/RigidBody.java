package rapier.dynamics;

import rapier.DroppableNative;
import rapier.math.*;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class RigidBody extends DroppableNative {
    protected RigidBody(MemorySegment memory) {
        super(memory);
    }

    public static RigidBody at(MemorySegment memory) {
        return new RigidBody(memory);
    }

    @Override
    protected void dropInternal() {
        RprRigidBody_drop(self);
    }

    public void getTranslation({{ realVector }} out) {
        {{ sys }}.RapierC.RprRigidBody_translation(self, out.memory());
    }
}
