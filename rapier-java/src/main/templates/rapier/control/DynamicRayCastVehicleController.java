package rapier.control;

import rapier.*;
import rapier.data.ArenaKey;
import rapier.dynamics.RigidBodySet;
import rapier.geometry.ColliderSet;
import rapier.math.Vector;
import rapier.pipeline.QueryFilter;
import rapier.pipeline.QueryPipeline;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.Arena;
import java.lang.foreign.ValueLayout;

public final class DynamicRayCastVehicleController extends RefNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
/*{% if dim3 %}*/
        dropped.drop(() -> rapier.sys_dim3.RapierC.RprDynamicRayCastVehicleController_drop(self));
/*{% endif %}*/
    }

    private DynamicRayCastVehicleController(MemorySegment memory) {
        super(memory);
    }

/*{% if dim3 %}*/
    public static DynamicRayCastVehicleController at(MemorySegment memory) {
        return new DynamicRayCastVehicleController(memory);
    }

    public static DynamicRayCastVehicleController of(
            ArenaKey chassis
    ) {
        try (var arena = Arena.openConfined()) {
            return at(rapier.sys_dim3.RapierC.RprDynamicRayCastVehicleController_new(
                    chassis.allocInto(arena)
            ));
        }
    }

    public __real getCurrentVehicleSpeed() {
        return rapier.sys_dim3.RapierC.RprDynamicRayCastVehicleController_current_vehicle_speed(self);
    }

    public ArenaKey getChassis() {
        try (var arena = Arena.openConfined()) {
            return ArenaKey.from(rapier.sys_dim3.RapierC.RprDynamicRayCastVehicleController_chassis(arena, self));
        }
    }

    public void setChassis(ArenaKey chassis) {
        try (var arena = Arena.openConfined()) {
            rapier.sys_dim3.RapierC.RprDynamicRayCastVehicleController_set_chassis(self, chassis.allocInto(arena));
        }
    }

    public long getIndexUpAxis() {
        return rapier.sys_dim3.RapierC.RprDynamicRayCastVehicleController_index_up_axis(self);
    }

    public void setIndexUpAxis(long value) {
        rapier.sys_dim3.RapierC.RprDynamicRayCastVehicleController_set_index_up_axis(self, value);
    }

    public long getIndexForwardAxis() {
        return rapier.sys_dim3.RapierC.RprDynamicRayCastVehicleController_index_forward_axis(self);
    }

    public void setIndexForwardAxis(long value) {
        rapier.sys_dim3.RapierC.RprDynamicRayCastVehicleController_set_index_forward_axis(self, value);
    }

    public Wheel addWheel(
            Vector chassisConnectionCs,
            Vector directionCs,
            Vector axleCs,
            __real suspensionRestLength,
            __real radius,
            WheelTuning tuning
    ) {
        try (var arena = Arena.openConfined()) {
            return Wheel.at(rapier.sys_dim3.RapierC.RprDynamicRayCastVehicleController_add_wheel(
                    self,
                    chassisConnectionCs.allocInto(arena),
                    directionCs.allocInto(arena),
                    axleCs.allocInto(arena),
                    suspensionRestLength,
                    radius,
                    tuning.allocInto(arena)
            ));
        }
    }

    public void updateVehicle(
            __real dt,
            RigidBodySet bodies,
            ColliderSet colliders,
            QueryPipeline queries,
            QueryFilter filter
    ) {
        try (var arena = Arena.openConfined()) {
            rapier.sys_dim3.RapierC.RprDynamicRayCastVehicleController_update_vehicle(
                    self,
                    dt,
                    bodies.memory(),
                    colliders.memory(),
                    queries.memory(),
                    filter.allocInto(arena)
            );
        }
    }

    public Wheel[] getWheels() {
        try (var arena = Arena.openConfined()) {
            var data = arena.allocate(ValueLayout.ADDRESS);
            var len = arena.allocate(ValueLayout.JAVA_LONG);
            rapier.sys_dim3.RapierC.RprDynamicRayCastVehicleController_wheels(self, data, len);
            return Native.fromPtrSlice(
                    data.get(ValueLayout.ADDRESS, 0),
                    (int) len.get(ValueLayout.JAVA_LONG, 0),
                    Wheel[]::new,
                    Wheel::at
            );
        }
    }
/*{% endif %}*/
}
