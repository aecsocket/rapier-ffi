package rapier.control;

import rapier.data.ArenaKey;
import rapier.math.Isometry;
import rapier.math.Vector;
import rapier.pipeline.TOI;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public record CharacterCollision(
        ArenaKey handle,
        Isometry characterPos,
        Vector translationApplied,
        Vector translationRemaining,
        TOI toi
) {
    public static long sizeof() {
        return rapier.sys.RprCharacterCollision.sizeof();
    }

    public static MemorySegment alloc(SegmentAllocator alloc) {
        return rapier.sys.RprCharacterCollision.allocate(alloc);
    }

    public static MemorySegment allocSlice(SegmentAllocator alloc, int len) {
        return rapier.sys.RprCharacterCollision.allocateArray(len, alloc);
    }

    public void into(MemorySegment memory) {
        handle.into(rapier.sys.RprCharacterCollision.handle$slice(memory));
        characterPos.into(rapier.sys.RprCharacterCollision.character_pos$slice(memory));
        translationApplied.into(rapier.sys.RprCharacterCollision.translation_applied$slice(memory));
        translationRemaining.into(rapier.sys.RprCharacterCollision.translation_remaining$slice(memory));
        toi.into(rapier.sys.RprCharacterCollision.toi$slice(memory));
    }

    public MemorySegment allocInto(SegmentAllocator alloc) {
        var memory = alloc(alloc);
        into(memory);
        return memory;
    }

    public static CharacterCollision from(MemorySegment memory) {
        return new CharacterCollision(
                ArenaKey.from(rapier.sys.RprCharacterCollision.handle$slice(memory)),
                Isometry.from(rapier.sys.RprCharacterCollision.character_pos$slice(memory)),
                Vector.from(rapier.sys.RprCharacterCollision.translation_applied$slice(memory)),
                Vector.from(rapier.sys.RprCharacterCollision.translation_remaining$slice(memory)),
                TOI.from(rapier.sys.RprCharacterCollision.toi$slice(memory))
        );
    }
}
