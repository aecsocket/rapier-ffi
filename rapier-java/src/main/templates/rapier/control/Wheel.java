package rapier.control;

import rapier.RefNative;
import rapier.__real;
import rapier.math.Vector;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.Arena;

public final class Wheel extends RefNative {
    private Wheel(MemorySegment memory) {
        super(memory);
    }

    public static Wheel at(MemorySegment memory) {
        return new Wheel(memory);
    }

/*{% if dim3 %}*/
    public Vector getChassisConnectionPointCs() {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys_dim3.RapierC.RprWheel_chassis_connection_point_cs(arena, self));
        }
    }

    public void setChassisConnectionPointCs(Vector value) {
        try (var arena = Arena.openConfined()) {
            rapier.sys_dim3.RapierC.RprWheel_set_chassis_connection_point_cs(self, value.allocInto(arena));
        }
    }

    public Vector getDirectionCs() {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys_dim3.RapierC.RprWheel_direction_cs(arena, self));
        }
    }

    public void setDirectionCs(Vector value) {
        try (var arena = Arena.openConfined()) {
            rapier.sys_dim3.RapierC.RprWheel_set_direction_cs(self, value.allocInto(arena));
        }
    }

    public Vector getAxleCs() {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys_dim3.RapierC.RprWheel_axle_cs(arena, self));
        }
    }

    public void setAxleCs(Vector value) {
        try (var arena = Arena.openConfined()) {
            rapier.sys_dim3.RapierC.RprWheel_set_axle_cs(self, value.allocInto(arena));
        }
    }

    public __real getSuspensionRestLength() {
        return rapier.sys_dim3.RapierC.RprWheel_suspension_rest_length(self);
    }

    public void setSuspensionRestLength(__real value) {
        rapier.sys_dim3.RapierC.RprWheel_set_suspension_rest_length(self, value);
    }

    public __real getMaxSuspensionTravel() {
        return rapier.sys_dim3.RapierC.RprWheel_max_suspension_travel(self);
    }

    public void setMaxSuspensionTravel(__real value) {
        rapier.sys_dim3.RapierC.RprWheel_set_max_suspension_travel(self, value);
    }

    public __real getRadius() {
        return rapier.sys_dim3.RapierC.RprWheel_radius(self);
    }

    public void setRadius(__real value) {
        rapier.sys_dim3.RapierC.RprWheel_set_radius(self, value);
    }

    public __real getSuspensionStiffness() {
        return rapier.sys_dim3.RapierC.RprWheel_suspension_stiffness(self);
    }

    public void setSuspensionStiffness(__real value) {
        rapier.sys_dim3.RapierC.RprWheel_set_suspension_stiffness(self, value);
    }

    public __real getDampingCompression() {
        return rapier.sys_dim3.RapierC.RprWheel_damping_compression(self);
    }

    public void setDampingCompression(__real value) {
        rapier.sys_dim3.RapierC.RprWheel_set_damping_compression(self, value);
    }

    public __real getDampingRelaxation() {
        return rapier.sys_dim3.RapierC.RprWheel_damping_relaxation(self);
    }

    public void setDampingRelaxation(__real value) {
        rapier.sys_dim3.RapierC.RprWheel_set_damping_relaxation(self, value);
    }

    public __real getRotation() {
        return rapier.sys_dim3.RapierC.RprWheel_rotation(self);
    }

    public void setRotation(__real value) {
        rapier.sys_dim3.RapierC.RprWheel_set_rotation(self, value);
    }

    public __real getMaxSuspensionForce() {
        return rapier.sys_dim3.RapierC.RprWheel_max_suspension_force(self);
    }

    public void setMaxSuspensionForce(__real value) {
        rapier.sys_dim3.RapierC.RprWheel_set_max_suspension_force(self, value);
    }

    public __real getForwardImpulse() {
        return rapier.sys_dim3.RapierC.RprWheel_forward_impulse(self);
    }

    public void setForwardImpulse(__real value) {
        rapier.sys_dim3.RapierC.RprWheel_set_forward_impulse(self, value);
    }

    public __real getSideImpulse() {
        return rapier.sys_dim3.RapierC.RprWheel_side_impulse(self);
    }

    public void setSideImpulse(__real value) {
        rapier.sys_dim3.RapierC.RprWheel_set_side_impulse(self, value);
    }

    public __real getSteering() {
        return rapier.sys_dim3.RapierC.RprWheel_steering(self);
    }

    public void setSteering(__real value) {
        rapier.sys_dim3.RapierC.RprWheel_set_steering(self, value);
    }

    public __real getEngineForce() {
        return rapier.sys_dim3.RapierC.RprWheel_engine_force(self);
    }

    public void setEngineForce(__real value) {
        rapier.sys_dim3.RapierC.RprWheel_set_engine_force(self, value);
    }

    public __real getBrake() {
        return rapier.sys_dim3.RapierC.RprWheel_brake(self);
    }

    public void setBrake(__real value) {
        rapier.sys_dim3.RapierC.RprWheel_set_brake(self, value);
    }

    public __real getWheelSuspensionForce() {
        return rapier.sys_dim3.RapierC.RprWheel_wheel_suspension_force(self);
    }

    public void setWheelSuspensionForce(__real value) {
        rapier.sys_dim3.RapierC.RprWheel_set_wheel_suspension_force(self, value);
    }

    public Vector getCenter() {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys_dim3.RapierC.RprWheel_center(arena, self));
        }
    }

    public Vector getSuspension() {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys_dim3.RapierC.RprWheel_suspension(arena, self));
        }
    }

    public Vector getAxle() {
        try (var arena = Arena.openConfined()) {
            return Vector.from(rapier.sys_dim3.RapierC.RprWheel_axle(arena, self));
        }
    }
/*{% endif %}*/
}
