package rapier.dynamics.joint.impulse;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;
import rapier.data.ArenaKey;
import rapier.dynamics.joint.GenericJoint;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;

import static rapier.sys.RapierC.*;

public final class ImpulseJointSet extends RefNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprImpulseJointSet_drop(self));
    }

    private ImpulseJointSet(MemoryAddress memory) {
        super(memory);
    }

    public static ImpulseJointSet at(MemoryAddress memory) {
        return new ImpulseJointSet(memory);
    }

    public static ImpulseJointSet create() {
        return at(RprImpulseJointSet_new());
    }

    public long size() {
        return RprImpulseJointSet_len(self);
    }

    public boolean isEmpty() {
        return RprImpulseJointSet_is_empty(self);
    }

    public boolean contains(long handle) {
        try (var arena = MemorySession.openConfined()) {
            return RprImpulseJointSet_contains(self, ArenaKey.unpack(arena, handle));
        }
    }

    public ImpulseJoint get(long handle) {
        try (var arena = MemorySession.openConfined()) {
            return ImpulseJoint.at(RprImpulseJointSet_get(self, ArenaKey.unpack(arena, handle)));
        }
    }

    public ImpulseJoint.Mut getMut(long handle) {
        try (var arena = MemorySession.openConfined()) {
            return ImpulseJoint.atMut(RprImpulseJointSet_get(self, ArenaKey.unpack(arena, handle)));
        }
    }

    public long insert(long body1, long body2, GenericJoint data, boolean wakeUp) {
        try (var arena = MemorySession.openConfined()) {
            return ArenaKey.pack(RprImpulseJointSet_insert(
                    arena,
                    self,
                    ArenaKey.unpack(arena, body1),
                    ArenaKey.unpack(arena, body2),
                    data.memory(),
                    wakeUp
            ));
        }
    }

    public ImpulseJoint.Mut remove(long handle, boolean wakeUp) {
        try (var arena = MemorySession.openConfined()) {
            return ImpulseJoint.atMut(RprImpulseJointSet_remove(self, ArenaKey.unpack(arena, handle), wakeUp));
        }
    }
}
