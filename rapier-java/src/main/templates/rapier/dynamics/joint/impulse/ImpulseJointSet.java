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

public final class ImpulseJointSet extends RefNative implements Droppable {
    public record Entry(ArenaKey handle, ImpulseJoint value) {}

    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> rapier.sys.RapierC.RprImpulseJointSet_drop(self));
    }

    private ImpulseJointSet(MemoryAddress memory) {
        super(memory);
    }

    public static ImpulseJointSet at(MemoryAddress memory) {
        return new ImpulseJointSet(memory);
    }

    public static ImpulseJointSet create() {
        return at(rapier.sys.RapierC.RprImpulseJointSet_new());
    }

    public long size() {
        return rapier.sys.RapierC.RprImpulseJointSet_len(self);
    }

    public boolean isEmpty() {
        return rapier.sys.RapierC.RprImpulseJointSet_is_empty(self);
    }

    private List<Entry> vecToList(SegmentAllocator alloc, MemoryAddress vec) {
        var len = (int) rapier.sys.RapierC.RprImpulseJointVec_len(vec);
        var res = new ArrayList<Entry>(len);
        for (int i = 0; i < len; i++) {
            var handle = ArenaKey.from(rapier.sys.RapierC.RprImpulseJointVec_handle(alloc, vec, i));
            var value = ImpulseJoint.at(rapier.sys.RapierC.RprImpulseJointVec_value(vec, i));
            res.add(new Entry(handle, value));
        }
        rapier.sys.RapierC.RprImpulseJointVec_drop(vec);
        return res;
    }

    public List<Entry> all() {
        try (var arena = MemorySession.openConfined()) {
            return vecToList(arena, rapier.sys.RapierC.RprImpulseJointSet_all(self));
        }
    }

    public boolean contains(ArenaKey handle) {
        try (var arena = MemorySession.openConfined()) {
            return rapier.sys.RapierC.RprImpulseJointSet_contains(self, handle.allocInto(arena));
        }
    }

    public ImpulseJoint get(ArenaKey handle) {
        try (var arena = MemorySession.openConfined()) {
            return ImpulseJoint.at(rapier.sys.RapierC.RprImpulseJointSet_get(self, handle.allocInto(arena)));
        }
    }

    public ImpulseJoint.Mut getMut(ArenaKey handle) {
        try (var arena = MemorySession.openConfined()) {
            return ImpulseJoint.atMut(rapier.sys.RapierC.RprImpulseJointSet_get(self, handle.allocInto(arena)));
        }
    }

    public ArenaKey insert(ArenaKey body1, ArenaKey body2, GenericJoint data, boolean wakeUp) {
        try (var arena = MemorySession.openConfined()) {
            return ArenaKey.from(rapier.sys.RapierC.RprImpulseJointSet_insert(
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
            return ImpulseJoint.atMut(rapier.sys.RapierC.RprImpulseJointSet_remove(self, handle.allocInto(arena), wakeUp));
        }
    }
}
