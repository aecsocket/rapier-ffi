package rapier.pipeline;

import rapier.DropFlag;
import rapier.Droppable;
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

    public @Nullable SimpleRayResult castRay(
            RigidBodySet bodies,
            ColliderSet colliders,
            Ray ray,
            {{ real }} maxToi,
            boolean solid,
            QueryFilter filter
    ) {
        try (var arena = MemorySession.openConfined()) {
            var res = SimpleRayResult.of(arena);
            if ({{ sys }}.RapierC.RprQueryPipeline_cast_ray(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    ray.memory(),
                    maxToi,
                    solid,
                    filter.memory(),
                    res.memory()
            )) return res;
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
            var res = ComplexRayResult.of(arena);
            if ({{ sys }}.RapierC.RprQueryPipeline_cast_ray_and_get_normal(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    ray.memory(),
                    maxToi,
                    solid,
                    filter.memory(),
                    res.memory()
            )) return res;
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
                    ray.memory(),
                    maxToi,
                    solid,
                    filter.memory(),
                    {{ sys }}.RprQueryPipeline_intersection_with_ray$callback.allocate(result -> {
                        return callback.run(ComplexRayResult.at(result));
                    }, arena)
            );
        }
    }

    public @Nullable Long intersectionWithShape(
            RigidBodySet bodies,
            ColliderSet colliders,
            Isometry shapePos,
            SharedShape shape,
            QueryFilter filter
    ) {
        try (var arena = MemorySession.openConfined()) {
            var res = arena.allocate(C_LONG, 0);
            if ({{ sys }}.RapierC.RprQueryPipeline_intersection_with_shape(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    shapePos.memory(),
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
            var res = SimplePointProject.of(arena);
            if ({{ sys }}.RapierC.RprQueryPipeline_project_point(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    point.memory(),
                    solid,
                    filter.memory(),
                    res.memory()
            )) return res;
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
                    point.memory(),
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
            var res = ComplexPointProject.of(arena);
            if ({{ sys }}.RapierC.RprQueryPipeline_project_point_and_get_feature(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    point.memory(),
                    filter.memory(),
                    res.memory()
            )) return res;
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
                    aabb.memory(),
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
            var res = ShapeCast.of(arena);
            if ({{ sys }}.RapierC.RprQueryPipeline_cast_shape(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    shapePos.memory(),
                    shapeVel.memory(),
                    shape.memory(),
                    maxToi,
                    stopAtPenetration,
                    filter.memory(),
                    res.memory()
            )) return res;
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
            var res = ShapeCast.of(arena);
            if ({{ sys }}.RapierC.RprQueryPipeline_nonlinear_cast_shape(
                    self,
                    bodies.memory(),
                    colliders.memory(),
                    shapeMotion.memory(),
                    shape.memory(),
                    startTime,
                    endTime,
                    stopAtPenetration,
                    filter.memory(),
                    res.memory()
            )) return res;
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
                    shapePos.memory(),
                    shape.memory(),
                    filter.memory(),
                    {{ sys }}.RprQueryPipeline_intersections_with_shape$callback.allocate(result -> {
                        return callback.run(ArenaKey.pack(result));
                    }, arena)
            );
        }
    }
}
