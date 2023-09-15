package rapier;

import java.lang.foreign.MemorySegment;

public interface RefCounted extends Native {
    MemorySegment refData();

    long strongCount();

    void acquire();

    void release();
}
