package rapier;

import java.lang.foreign.MemoryAddress;

public interface RefCounted extends Native {
    MemoryAddress refData();

    long strongCount();

    void acquire();

    void release();
}
