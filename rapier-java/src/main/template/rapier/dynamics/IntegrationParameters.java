package rapier.dynamics;

import rapier.DroppableNative;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

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

    public {{ real }} getDt() {
        return {{ sys }}.RprIntegrationParameters_dt(self).get(Real, 0);
    }

    public void setDt({{ real }} dt) {
        {{ sys }}.RprIntegrationParameters_dt(self).set(Real, 0, dt.value());
    }
}
