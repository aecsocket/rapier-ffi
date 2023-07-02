package rapier.pipeline;

import rapier.*;
import rapier.data.ArenaKey;
import rapier.dynamics.RigidBodySet;
import rapier.geometry.ColliderSet;
import rapier.math.Aabb;
import rapier.math.Isometry;
import rapier.math.Ray;
import rapier.math.Vector;
import rapier.shape.SharedShape;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;

public final class QueryPipeline extends RefNative implements Droppable {
    public interface IntersectionWithRayCallback {
        boolean run(ComplexRayResult result);
    }

    public interface IntersectionsWithPointCallback {
        boolean run(ArenaKey collHandle);
    }

    public interface CollidersWithAabbIntersectingAabbCallback {
        boolean run(ArenaKey collHandle);
    }

    public interface IntersectionsWithShapeCallback {
        boolean run(ArenaKey collHandle);
    }

    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> rapier.sys.RapierC.RprQueryPipeline_drop(self));
    }

    private QueryPipeline(MemoryAddress memory) {
        super(memory);
    }

    public static QueryPipeline at(MemoryAddress memory) {
        return new QueryPipeline(memory);
    }

    public static QueryPipeline create() {
        return at(rapier.sys.RapierC.RprQueryPipeline_new());
    }

    public void update(
            RigidBodySet bodies,
            ColliderSet colliders
    ) {
        rapier.sys.RapierC.RprQueryPipeline_update(self, bodies.memory(), colliders.memory());
    }

    public static void updateAll(
            QueryPipeline[] pipeline,
            RigidBodySet[] bodies,
            ColliderSet[] colliders
    ) {
        if (
                pipeline.length != bodies.length
                || bodies.length != colliders.length
        ) {
            throw new IllegalArgumentException("All arrays must be of the same length");
        }
        try (var arena = MemorySession.openConfined()) {
            var nPipeline = Native.allocPtrSlice(arena, pipeline);
            var nBodies = Native.allocPtrSlice(arena, bodies);
            var nColliders = Native.allocPtrSlice(arena, colliders);
            rapier.sys.RapierC.RprQueryPipeline_update_all(
                    pipeline.length,
                    nPipeline,
                    nBodies,
                    nColliders
            );
        }
    }

    public @Nullable SimpleRayResult castRay(
            RigidBodySet bodies,
            ColliderSet colliders,
            Ray ray,
            __real maxToi,
            boolean solid,
            QueryFilter filter
    ) {
        try (var arena = MemorySession.openConfined()) {
            var res = SimpleRayResult.alloc(arena);
            if (rapier.sys.RapierC.RprQueryPipeline_cast_ray(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    ray.allocInto(arena),
                    maxToi,
                    solid,
                    filter.allocInto(arena),
                    res
            )) return SimpleRayResult.from(res);
            return null;
        }
    }

    public @Nullable ComplexRayResult castRayAndGetNormal(
            RigidBodySet bodies,
            ColliderSet colliders,
            Ray ray,
            __real maxToi,
            boolean solid,
            QueryFilter filter
    ) {
        try (var arena = MemorySession.openConfined()) {
            var res = ComplexRayResult.alloc(arena);
            if (rapier.sys.RapierC.RprQueryPipeline_cast_ray_and_get_normal(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    ray.allocInto(arena),
                    maxToi,
                    solid,
                    filter.allocInto(arena),
                    res
            )) return ComplexRayResult.from(res);
            return null;
        }
    }

    public void intersectionWithRay(
            RigidBodySet bodies,
            ColliderSet colliders,
            Ray ray,
            __real maxToi,
            boolean solid,
            QueryFilter filter,
            IntersectionWithRayCallback callback
    ) {
        try (var arena = MemorySession.openConfined()) {
            rapier.sys.RapierC.RprQueryPipeline_intersection_with_ray(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    ray.allocInto(arena),
                    maxToi,
                    solid,
                    filter.allocInto(arena),
                    rapier.sys.RprQueryPipeline_intersection_with_ray$callback.allocate(
                            (result) -> callback.run(
                                    ComplexRayResult.from(result)
                            ), arena
                    )
            );
        }
    }

    public @Nullable ArenaKey intersectionWithShape(
            RigidBodySet bodies,
            ColliderSet colliders,
            Isometry shapePos,
            SharedShape shape,
            QueryFilter filter
    ) {
        try (var arena = MemorySession.openConfined()) {
            var res = ArenaKey.alloc(arena);
            if (rapier.sys.RapierC.RprQueryPipeline_intersection_with_shape(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    shapePos.allocInto(arena),
                    shape.memory(),
                    filter.allocInto(arena),
                    res
            )) return ArenaKey.from(res);
            return null;
        }
    }

    public @Nullable SimplePointProject projectPoint(
            RigidBodySet bodies,
            ColliderSet colliders,
            Vector point,
            boolean solid,
            QueryFilter filter
    ) {
        try (var arena = MemorySession.openConfined()) {
            var res = SimplePointProject.alloc(arena);
            if (rapier.sys.RapierC.RprQueryPipeline_project_point(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    point.allocInto(arena),
                    solid,
                    filter.allocInto(arena),
                    res
            )) return SimplePointProject.from(res);
            return null;
        }
    }

    public void intersectionsWithPoint(
            RigidBodySet bodies,
            ColliderSet colliders,
            Vector point,
            QueryFilter filter,
            IntersectionsWithPointCallback callback
    ) {
        try (var arena = MemorySession.openConfined()) {
            rapier.sys.RapierC.RprQueryPipeline_intersections_with_point(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    point.allocInto(arena),
                    filter.allocInto(arena),
                    rapier.sys.RprQueryPipeline_intersections_with_point$callback.allocate(
                            (result) -> callback.run(
                                    ArenaKey.from(result)
                            ), arena
                    )
            );
        }
    }

    public @Nullable ComplexPointProject projectPointAndGetFeature(
            RigidBodySet bodies,
            ColliderSet colliders,
            Vector point,
            QueryFilter filter
    ) {
        try (var arena = MemorySession.openConfined()) {
            var res = ComplexPointProject.alloc(arena);
            if (rapier.sys.RapierC.RprQueryPipeline_project_point_and_get_feature(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    point.allocInto(arena),
                    filter.allocInto(arena),
                    res
            )) return ComplexPointProject.from(res);
            return null;
        }
    }

    public void collidersWithAabbIntersectingAabb(
            Aabb aabb,
            CollidersWithAabbIntersectingAabbCallback callback
    ) {
        try (var arena = MemorySession.openConfined()) {
            rapier.sys.RapierC.RprQueryPipeline_colliders_with_aabb_intersecting_aabb(
                    self,
                    aabb.allocInto(arena),
                    rapier.sys.RprQueryPipeline_colliders_with_aabb_intersecting_aabb$callback.allocate(
                            (result) -> callback.run(
                                    ArenaKey.from(result)
                            ), arena
                    )
            );
        }
    }

    public @Nullable ShapeCast castShape(
            RigidBodySet bodies,
            ColliderSet colliders,
            Isometry shapePos,
            Vector shapeVel,
            SharedShape shape,
            __real maxToi,
            boolean stopAtPenetration,
            QueryFilter filter
    ) {
        try (var arena = MemorySession.openConfined()) {
            var res = ShapeCast.alloc(arena);
            if (rapier.sys.RapierC.RprQueryPipeline_cast_shape(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    shapePos.allocInto(arena),
                    shapeVel.allocInto(arena),
                    shape.memory(),
                    maxToi,
                    stopAtPenetration,
                    filter.allocInto(arena),
                    res
            )) return ShapeCast.from(res);
            return null;
        }
    }

    public @Nullable ShapeCast nonlinearCastShape(
            RigidBodySet bodies,
            ColliderSet colliders,
            NonlinearRigidMotion shapeMotion,
            SharedShape shape,
            __real startTime,
            __real endTime,
            boolean stopAtPenetration,
            QueryFilter filter
    ) {
        try (var arena = MemorySession.openConfined()) {
            var res = ShapeCast.alloc(arena);
            if (rapier.sys.RapierC.RprQueryPipeline_nonlinear_cast_shape(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    shapeMotion.allocInto(arena),
                    shape.memory(),
                    startTime,
                    endTime,
                    stopAtPenetration,
                    filter.allocInto(arena),
                    res
            )) return ShapeCast.from(res);
            return null;
        }
    }

    public void intersectionsWithShape(
            RigidBodySet bodies,
            ColliderSet colliders,
            Isometry shapePos,
            SharedShape shape,
            QueryFilter filter,
            IntersectionsWithShapeCallback callback
    ) {
        try (var arena = MemorySession.openConfined()) {
            rapier.sys.RapierC.RprQueryPipeline_intersections_with_shape(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    shapePos.allocInto(arena),
                    shape.memory(),
                    filter.allocInto(arena),
                    rapier.sys.RprQueryPipeline_intersections_with_shape$callback.allocate(
                            (result) -> callback.run(
                                    ArenaKey.from(result)
                            ), arena
                    )
            );
        }
    }
}
