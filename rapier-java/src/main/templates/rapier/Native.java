package rapier;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.util.function.Consumer;

public interface Native {
    MemoryAddress memory();

    static MemoryAddress memoryOrNull(@Nullable Native obj) {
        return obj == null ? MemoryAddress.NULL : obj.memory();
    }
}
