package control;

import rapier.*;
import rapier.dynamics.RigidBodySet;
import rapier.geometry.ColliderSet;
import rapier.math.Isometry;
import rapier.math.Vector;
import rapier.pipeline.*;
import rapier.shape.SharedShape;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;

public final class KinematicCharacterController extends RefNative implements Droppable {
    public interface MoveEvents {
        void handle(CharacterCollision collision);
    }

    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> rapier.sys.RapierC.RprKinematicCharacterController_drop(self));
    }

    private KinematicCharacterController(MemoryAddress memory) {
        super(memory);
    }

    public static KinematicCharacterController at(MemoryAddress memory) {
        return new KinematicCharacterController(memory);
    }

    public static KinematicCharacterController of(
            Vector up,
            CharacterLength offset,
            boolean slide,
            @Nullable CharacterAutostep autostep,
            __real maxSlopeClimbAngle,
            __real minSlopeSlideAngle,
            @Nullable CharacterLength snapToGround
    ) {
        try (var arena = MemorySession.openConfined()) {
            return at(rapier.sys.RapierC.RprKinematicCharacterController_new(
                    up.allocInto(arena),
                    offset.allocInto(arena),
                    slide,
                    autostep == null ? MemoryAddress.NULL : autostep.allocInto(arena),
                    maxSlopeClimbAngle,
                    minSlopeSlideAngle,
                    snapToGround == null ? MemoryAddress.NULL : snapToGround.allocInto(arena)
            ));
        }
    }

    public static KinematicCharacterController defaults() {
       return at(rapier.sys.RapierC.RprKinematicCharacterController_default());
    }

    public Vector getUp() {
        try (var arena = MemorySession.openConfined()) {
            return Vector.from(rapier.sys.RapierC.RprKinematicCharacterController_up(arena, self));
        }
    }

    public void setUp(Vector value) {
        try (var arena = MemorySession.openConfined()) {
            rapier.sys.RapierC.RprKinematicCharacterController_set_up(self, value.allocInto(arena));
        }
    }

    public CharacterLength getOffset() {
        try (var arena = MemorySession.openConfined()) {
            return CharacterLength.from(rapier.sys.RapierC.RprKinematicCharacterController_offset(arena, self));
        }
    }

    public void setOffset(CharacterLength value) {
        try (var arena = MemorySession.openConfined()) {
            rapier.sys.RapierC.RprKinematicCharacterController_set_offset(self, value.allocInto(arena));
        }
    }

    public boolean getSlide() {
        return rapier.sys.RapierC.RprKinematicCharacterController_slide(self);
    }

    public void setSlide(boolean value) {
        rapier.sys.RapierC.RprKinematicCharacterController_set_slide(self, value);
    }

    public @Nullable CharacterAutostep getAutostep() {
        try (var arena = MemorySession.openConfined()) {
            var res = CharacterAutostep.alloc(arena);
            if (rapier.sys.RapierC.RprKinematicCharacterController_autostep(self, res))
                return CharacterAutostep.from(res);
            return null;
        }
    }

    public void setAutostep(@Nullable CharacterAutostep value) {
        if (value == null) {
            rapier.sys.RapierC.RprKinematicCharacterController_clear_autostep(self);
        } else {
            try (var arena = MemorySession.openConfined()) {
                rapier.sys.RapierC.RprKinematicCharacterController_set_autostep(self, value.allocInto(arena));
            }
        }
    }

    public __real getMaxSlopeClimbAngle() {
        return rapier.sys.RapierC.RprKinematicCharacterController_max_slope_climb_angle(self);
    }

    public void setMaxSlopeClimbAngle(__real value) {
        rapier.sys.RapierC.RprKinematicCharacterController_set_max_slope_climb_angle(self, value);
    }

    public __real getMinSlopeSlideAngle() {
        return rapier.sys.RapierC.RprKinematicCharacterController_min_slope_slide_angle(self);
    }

    public void setMinSlopeSlideAngle(__real value) {
        rapier.sys.RapierC.RprKinematicCharacterController_set_min_slope_slide_angle(self, value);
    }

    public @Nullable CharacterLength getSnapToGround() {
        try (var arena = MemorySession.openConfined()) {
            var res = CharacterLength.alloc(arena);
            if (rapier.sys.RapierC.RprKinematicCharacterController_snap_to_ground(self, res))
                return CharacterLength.from(res);
            return null;
        }
    }

    public void setSnapToGround(@Nullable CharacterLength value) {
        if (value == null) {
            rapier.sys.RapierC.RprKinematicCharacterController_clear_snap_to_ground(self);
        } else {
            try (var arena = MemorySession.openConfined()) {
                rapier.sys.RapierC.RprKinematicCharacterController_set_snap_to_ground(self, value.allocInto(arena));
            }
        }
    }

    public EffectiveCharacterMovement moveShape(
            __real dt,
            RigidBodySet bodies,
            ColliderSet colliders,
            QueryPipeline queries,
            SharedShape characterShape,
            Isometry characterPos,
            Vector desiredTranslation,
            QueryFilter filter,
            MoveEvents events
    ) {
        try (var arena = MemorySession.openConfined()) {
            return EffectiveCharacterMovement.from(rapier.sys.RapierC.RprKinematicCharacterController_move_shape(
                    arena,
                    self,
                    dt,
                    bodies.memory(),
                    colliders.memory(),
                    queries.memory(),
                    characterShape.memory(),
                    characterPos.allocInto(arena),
                    desiredTranslation.allocInto(arena),
                    filter.allocInto(arena),
                    rapier.sys.RprKinematicCharacterController_move_shape$events.allocate(
                            (coll) -> events.handle(
                                    CharacterCollision.from(coll)
                            ), arena
                    )
            ));
        }
    }

    public void solveCharacterCollisionImpulses(
            __real dt,
            RigidBodySet bodies,
            ColliderSet colliders,
            QueryPipeline queries,
            SharedShape characterShape,
            __real characterMass,
            CharacterCollision collision,
            QueryFilter filter
    ) {
        try (var arena = MemorySession.openConfined()) {
            rapier.sys.RapierC.RprKinematicCharacterController_solve_character_collision_impulses(
                    self,
                    dt,
                    bodies.memory(),
                    colliders.memory(),
                    queries.memory(),
                    characterShape.memory(),
                    characterMass,
                    collision.allocInto(arena),
                    filter.allocInto(arena)
            );
        }
    }
}
