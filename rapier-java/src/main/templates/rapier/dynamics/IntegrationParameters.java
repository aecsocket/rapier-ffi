package rapier.dynamics;

import rapier.BaseNative;
import rapier.DropFlag;
import rapier.Droppable;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

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

    private static IntegrationParameters at(MemorySegment memory) {
        return new IntegrationParameters(memory);
    }

    public static IntegrationParameters ofDefault() {
        return at(RprIntegrationParameters_default());
    }

    public {{ real }} getDt() {
        return {{ sys }}.RapierC.RprIntegrationParameters_dt(self).get({{ realLayout }}, 0);
    }

    public void setDt({{ real }} dt) {
        {{ sys }}.RapierC.RprIntegrationParameters_dt(self).set({{ realLayout }}, 0, dt);
    }
}
