package rapier;

import javax.annotation.Nullable;
import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;

public interface Native {
    Addressable memory();

    static Addressable memoryOrNull(@Nullable Native obj) {
        return obj == null ? MemoryAddress.NULL : obj.memory();
    }
}
