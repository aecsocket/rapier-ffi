package rapier;

import javax.annotation.Nullable;
import java.lang.foreign.MemorySegment;

public interface Native {
    MemorySegment memory();

    static MemorySegment memoryOrNull(@Nullable Native obj) {
        return obj == null ? MemorySegment.NULL : obj.memory();
    }
}
