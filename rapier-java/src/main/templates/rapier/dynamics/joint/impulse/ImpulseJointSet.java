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
    public record Entry(ArenaKey handle, ImpulseJoint value) {}

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
            var handle = ArenaKey.from(RprImpulseJointVec_handle(alloc, vec, i));
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

    public boolean contains(ArenaKey handle) {
        try (var arena = MemorySession.openConfined()) {
            return RprImpulseJointSet_contains(self, handle.allocInto(arena));
        }
    }

    public ImpulseJoint get(ArenaKey handle) {
        try (var arena = MemorySession.openConfined()) {
            return ImpulseJoint.at(RprImpulseJointSet_get(self, handle.allocInto(arena)));
        }
    }

    public ImpulseJoint.Mut getMut(ArenaKey handle) {
        try (var arena = MemorySession.openConfined()) {
            return ImpulseJoint.atMut(RprImpulseJointSet_get(self, handle.allocInto(arena)));
        }
    }

    public ArenaKey insert(ArenaKey body1, ArenaKey body2, GenericJoint data, boolean wakeUp) {
        try (var arena = MemorySession.openConfined()) {
            return ArenaKey.from(RprImpulseJointSet_insert(
                    arena,
                    self,
                    body1.allocInto(arena),
                    body2.allocInto(arena),
                    data.memory(),
                    wakeUp
            ));
        }
    }

    public ImpulseJoint.Mut remove(ArenaKey handle, boolean wakeUp) {
        try (var arena = MemorySession.openConfined()) {
            return ImpulseJoint.atMut(RprImpulseJointSet_remove(self, handle.allocInto(arena), wakeUp));
        }
    }
}
