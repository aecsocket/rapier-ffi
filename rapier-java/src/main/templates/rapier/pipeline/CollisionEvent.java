package rapier.pipeline;

import rapier.data.ArenaKey;
import rapier.sys.RprCollisionEvent;
import rapier.sys.Started_Body;
import rapier.sys.Stopped_Body;

import java.lang.foreign.MemorySegment;

public sealed interface CollisionEvent {
    record Started(long coll1, long coll2, int flags) implements CollisionEvent {}

    record Stopped(long coll1, long coll2, int flags) implements CollisionEvent {}

    static CollisionEvent from(MemorySegment memory) {
        var tag = RprCollisionEvent.tag$get(memory);
        return switch (tag) {
            case 0 -> {
                var body = RprCollisionEvent.started$slice(memory);
                yield new Started(
                        ArenaKey.pack(Started_Body.coll1$slice(body)),
                        ArenaKey.pack(Started_Body.coll2$slice(body)),
                        Started_Body.flags$get(body)
                );
            }
            case 1 -> {
                var body = RprCollisionEvent.stopped$slice(memory);
                yield new Stopped(
                        ArenaKey.pack(Stopped_Body.coll1$slice(body)),
                        ArenaKey.pack(Stopped_Body.coll2$slice(body)),
                        Stopped_Body.flags$get(body)
                );
            }
            default -> throw new IllegalArgumentException("Invalid tag " + tag);
        };
    }
}
