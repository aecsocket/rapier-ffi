package rapier.dynamics;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;

import java.lang.foreign.MemoryAddress;

import static rapier.sys.RapierC.*;

public final class IntegrationParameters extends RefNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprIntegrationParameters_drop(self));
    }

    private IntegrationParameters(MemoryAddress memory) {
        super(memory);
    }

    public static IntegrationParameters at(MemoryAddress memory) {
        return new IntegrationParameters(memory);
    }
}
