package rapier.pipeline;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.Native;
import rapier.RefNative;
import rapier.data.ArenaKey;
import rapier.dynamics.RigidBodySet;
import rapier.geometry.ColliderSet;
import rapier.math.Aabb;
import rapier.math.Isometry;
import rapier.math.Ray;
import rapier.math.Vector;
import rapier.shape.SharedShape;
import rapier.sys.*;

import javax.annotation.Nullable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SegmentAllocator;

import static rapier.sys.RapierC.*;

public final class QueryPipeline extends RefNative implements Droppable {
    public interface IntersectionWithRayCallback {
        boolean run(ComplexRayResult result);
    }

    public interface IntersectionsWithPointCallback {
        boolean run(long collHandle);
    }

    public interface CollidersWithAabbIntersectingAabbCallback {
        boolean run(long collHandle);
    }

    public interface IntersectionsWithShapeCallback {
        boolean run(long collHandle);
    }

    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprQueryPipeline_drop(self));
    }

    private QueryPipeline(MemoryAddress memory) {
        super(memory);
    }

    public static QueryPipeline at(MemoryAddress memory) {
        return new QueryPipeline(memory);
    }

    public static QueryPipeline create() {
        return at(RprQueryPipeline_new());
    }

    public void update(
            RigidBodySet bodies,
            ColliderSet colliders
    ) {
        RprQueryPipeline_update(self, bodies.memory(), colliders.memory());
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
            var nPipeline = Native.allocatePtrArray(arena, pipeline);
            var nBodies = Native.allocatePtrArray(arena, bodies);
            var nColliders = Native.allocatePtrArray(arena, colliders);
            RprQueryPipeline_update_all(
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
            {{ real }} maxToi,
            boolean solid,
            QueryFilter filter
    ) {
        try (var arena = MemorySession.openConfined()) {
            var res = SimpleRayResult.allocate(arena);
            if ({{ sys }}.RapierC.RprQueryPipeline_cast_ray(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    ray.allocate(arena),
                    maxToi,
                    solid,
                    filter.memory(),
                    res
            )) return SimpleRayResult.from(res);
            return null;
        }
    }

    public @Nullable ComplexRayResult castRayAndGetNormal(
            RigidBodySet bodies,
            ColliderSet colliders,
            Ray ray,
            {{ real }} maxToi,
            boolean solid,
            QueryFilter filter
    ) {
        try (var arena = MemorySession.openConfined()) {
            var res = ComplexRayResult.allocate(arena);
            if ({{ sys }}.RapierC.RprQueryPipeline_cast_ray_and_get_normal(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    ray.allocate(arena),
                    maxToi,
                    solid,
                    filter.memory(),
                    res
            )) return ComplexRayResult.from(res);
            return null;
        }
    }

    public void intersectionWithRay(
            RigidBodySet bodies,
            ColliderSet colliders,
            Ray ray,
            {{ real }} maxToi,
            boolean solid,
            QueryFilter filter,
            IntersectionWithRayCallback callback
    ) {
        try (var arena = MemorySession.openConfined()) {
            {{ sys }}.RapierC.RprQueryPipeline_intersection_with_ray(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    ray.allocate(arena),
                    maxToi,
                    solid,
                    filter.memory(),
                    {{ sys }}.RprQueryPipeline_intersection_with_ray$callback.allocate(result -> {
                        return callback.run(ComplexRayResult.from(result));
                    }, arena)
            );
        }
    }

    public @Nullable Long intersectionWithShape(
            SegmentAllocator alloc,
            RigidBodySet bodies,
            ColliderSet colliders,
            Isometry shapePos,
            SharedShape shape,
            QueryFilter filter
    ) {
        try (var arena = MemorySession.openConfined()) {
            var res = alloc.allocate(C_LONG, 0);
            if ({{ sys }}.RapierC.RprQueryPipeline_intersection_with_shape(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    shapePos.allocate(arena),
                    shape.memory(),
                    filter.memory(),
                    res
            )) return ArenaKey.pack(res);
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
            var res = SimplePointProject.allocate(arena);
            if ({{ sys }}.RapierC.RprQueryPipeline_project_point(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    point.allocate(arena),
                    solid,
                    filter.memory(),
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
            {{ sys }}.RapierC.RprQueryPipeline_intersections_with_point(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    point.allocate(arena),
                    filter.memory(),
                    {{ sys }}.RprQueryPipeline_intersections_with_point$callback.allocate(result -> {
                        return callback.run(ArenaKey.pack(result));
                    }, arena)
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
            var res = ComplexPointProject.allocate(arena);
            if ({{ sys }}.RapierC.RprQueryPipeline_project_point_and_get_feature(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    point.allocate(arena),
                    filter.memory(),
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
            {{ sys }}.RapierC.RprQueryPipeline_colliders_with_aabb_intersecting_aabb(
                    self,
                    aabb.allocate(arena),
                    {{ sys }}.RprQueryPipeline_colliders_with_aabb_intersecting_aabb$callback.allocate(result -> {
                        return callback.run(ArenaKey.pack(result));
                    }, arena)
            );
        }
    }

    public @Nullable ShapeCast castShape(
            RigidBodySet bodies,
            ColliderSet colliders,
            Isometry shapePos,
            Vector shapeVel,
            SharedShape shape,
            {{ real }} maxToi,
            boolean stopAtPenetration,
            QueryFilter filter
    ) {
        try (var arena = MemorySession.openConfined()) {
            var res = ShapeCast.allocate(arena);
            if ({{ sys }}.RapierC.RprQueryPipeline_cast_shape(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    shapePos.allocate(arena),
                    shapeVel.allocate(arena),
                    shape.memory(),
                    maxToi,
                    stopAtPenetration,
                    filter.memory(),
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
            {{ real }} startTime,
            {{ real }} endTime,
            boolean stopAtPenetration,
            QueryFilter filter
    ) {
        try (var arena = MemorySession.openConfined()) {
            var res = ShapeCast.allocate(arena);
            if ({{ sys }}.RapierC.RprQueryPipeline_nonlinear_cast_shape(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    shapeMotion.allocate(arena),
                    shape.memory(),
                    startTime,
                    endTime,
                    stopAtPenetration,
                    filter.memory(),
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
            {{ sys }}.RapierC.RprQueryPipeline_intersections_with_shape(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    shapePos.allocate(arena),
                    shape.memory(),
                    filter.memory(),
                    {{ sys }}.RprQueryPipeline_intersections_with_shape$callback.allocate(result -> {
                        return callback.run(ArenaKey.pack(result));
                    }, arena)
            );
        }
    }
}
