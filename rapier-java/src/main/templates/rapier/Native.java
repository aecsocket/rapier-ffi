package rapier;

import javax.annotation.Nullable;
import java.lang.foreign.MemorySegment;

public abstract class Native {
    protected final MemorySegment self;

    protected Native(MemorySegment memory) {
        this.self = memory;
    }

    public MemorySegment memory() {
        return self;
    }

    public static MemorySegment memoryOrNull(@Nullable Native obj) {
        return obj == null ? MemorySegment.NULL : obj.memory();
    }
}
