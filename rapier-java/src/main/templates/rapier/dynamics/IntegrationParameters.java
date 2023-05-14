package rapier.dynamics;

import rapier.BaseNative;
import rapier.DropFlag;
import rapier.Droppable;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class IntegrationParameters extends BaseNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprIntegrationParameters_drop(self));
    }

    protected IntegrationParameters(MemorySegment memory) {
        super(memory);
    }

    public static IntegrationParameters at(MemorySegment memory) {
        return new IntegrationParameters(memory);
    }
}
