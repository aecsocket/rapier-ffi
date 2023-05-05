package rapier.dynamics;

import rapier.DroppableNative;
import rapier.math.Real;

import java.lang.foreign.MemorySegment;

import static rapier.headers.RapierC.*;

public final class IntegrationParameters extends DroppableNative {
    protected IntegrationParameters(MemorySegment memory) {
        super(memory);
    }

    private static IntegrationParameters at(MemorySegment memory) {
        return new IntegrationParameters(memory);
    }

    public static IntegrationParameters ofDefault() {
        return at(RprIntegrationParameters_default());
    }

    @Override
    protected void dropInternal() {
        RprIntegrationParameters_drop(self);
    }

    public Real getDt() {
        return RprIntegrationParameters_dt(self).get(Real, 0);
    }

    public void setDt(Real dt) {
        RprIntegrationParameters_dt(self).set(Real, 0, dt.value());
    }
}
