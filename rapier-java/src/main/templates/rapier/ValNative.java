package rapier;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;

public non-sealed abstract class ValNative extends BaseNative {
    protected final MemorySegment self;

    protected ValNative(MemorySegment memory) {
        this.self = memory;
    }

    @Override
    public MemorySegment memory() {
        return self;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ValNative nt)) return false;
        return self.equals(nt.self);
    }

    @Override
    public int hashCode() {
        return self.hashCode();
    }
}
