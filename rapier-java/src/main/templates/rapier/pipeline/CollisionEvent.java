package rapier.pipeline;

import rapier.data.ArenaKey;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public sealed interface CollisionEvent {
    record Started(ArenaKey coll1, ArenaKey coll2, int flags) implements CollisionEvent {}

    record Stopped(ArenaKey coll1, ArenaKey coll2, int flags) implements CollisionEvent {}

    static long sizeof() {
        return rapier.sys.RprCollisionEvent.sizeof();
    }

    static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprCollisionEvent.allocate(alloc);
    }

    static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprCollisionEvent.allocateArray(len, alloc);
    }

    static CollisionEvent from(MemorySegment memory) {
        var tag = rapier.sys.RprCollisionEvent.tag$get(memory);
        return switch (tag) {
            case 0 -> {
                var body = rapier.sys.RprCollisionEvent.started$slice(memory);
                yield new Started(
                        ArenaKey.from(rapier.sys.Started_Body.coll1$slice(body)),
                        ArenaKey.from(rapier.sys.Started_Body.coll2$slice(body)),
                        rapier.sys.Started_Body.flags$get(body)
                );
            }
            case 1 -> {
                var body = rapier.sys.RprCollisionEvent.stopped$slice(memory);
                yield new Stopped(
                        ArenaKey.from(rapier.sys.Stopped_Body.coll1$slice(body)),
                        ArenaKey.from(rapier.sys.Stopped_Body.coll2$slice(body)),
                        rapier.sys.Stopped_Body.flags$get(body)
                );
            }
            default -> throw new IllegalArgumentException("Invalid tag " + tag);
        };
    }
}
