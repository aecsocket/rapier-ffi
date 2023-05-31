package rapier.dynamics.joint.impulse;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;
import rapier.data.ArenaKey;
import rapier.dynamics.joint.GenericJoint;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;
import java.util.ArrayList;
import java.util.List;

import static rapier.sys.RapierC.*;

public final class ImpulseJointSet extends RefNative implements Droppable {
    public record Entry(long handle, ImpulseJoint value) {}

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

    private List<Entry> vecToList(SegmentAllocator alloc, MemoryAddress vec) {
        var len = (int) RprImpulseJointVec_len(vec);
        var res = new ArrayList<Entry>(len);
        for (int i = 0; i < len; i++) {
            var handle = ArenaKey.pack(RprImpulseJointVec_handle(alloc, vec, i));
            var value = ImpulseJoint.at(RprImpulseJointVec_value(vec, i));
            res.add(new Entry(handle, value));
        }
        RprImpulseJointVec_drop(vec);
        return res;
    }

    public List<Entry> all() {
        try (var arena = MemorySession.openConfined()) {
            return vecToList(arena, RprImpulseJointSet_all(self));
        }
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
