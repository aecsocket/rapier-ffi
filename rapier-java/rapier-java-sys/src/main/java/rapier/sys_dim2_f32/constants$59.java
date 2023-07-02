// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$59 {

    static final FunctionDescriptor RprQueryPipeline_cast_shape$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("re"),
                Constants$root.C_FLOAT$LAYOUT.withName("im")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y")
            ).withName("translation")
        ).withName("RprIsometry"),
        MemoryLayout.structLayout(
            Constants$root.C_FLOAT$LAYOUT.withName("x"),
            Constants$root.C_FLOAT$LAYOUT.withName("y")
        ).withName("RprVector"),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("flags"),
            Constants$root.C_BOOL$LAYOUT.withName("has_groups"),
            MemoryLayout.paddingLayout(24),
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("memberships"),
                Constants$root.C_INT$LAYOUT.withName("filter")
            ).withName("groups"),
            Constants$root.C_BOOL$LAYOUT.withName("has_exclude_collider"),
            MemoryLayout.paddingLayout(24),
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("index"),
                Constants$root.C_INT$LAYOUT.withName("generation")
            ).withName("exclude_collider"),
            Constants$root.C_BOOL$LAYOUT.withName("has_exclude_rigid_body"),
            MemoryLayout.paddingLayout(24),
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("index"),
                Constants$root.C_INT$LAYOUT.withName("generation")
            ).withName("exclude_rigid_body"),
            Constants$root.C_POINTER$LAYOUT.withName("predicate")
        ).withName("RprQueryFilter"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprQueryPipeline_cast_shape$MH = RuntimeHelper.downcallHandle(
        "RprQueryPipeline_cast_shape",
        constants$59.RprQueryPipeline_cast_shape$FUNC
    );
    static final FunctionDescriptor RprQueryPipeline_colliders_with_aabb_intersecting_aabb$callback$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprQueryPipeline_colliders_with_aabb_intersecting_aabb$callback$MH = RuntimeHelper.downcallHandle(
        constants$59.RprQueryPipeline_colliders_with_aabb_intersecting_aabb$callback$FUNC
    );
    static final FunctionDescriptor RprQueryPipeline_colliders_with_aabb_intersecting_aabb$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y")
            ).withName("min"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y")
            ).withName("max")
        ).withName("RprAabb"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprQueryPipeline_colliders_with_aabb_intersecting_aabb$MH = RuntimeHelper.downcallHandle(
        "RprQueryPipeline_colliders_with_aabb_intersecting_aabb",
        constants$59.RprQueryPipeline_colliders_with_aabb_intersecting_aabb$FUNC
    );
    static final FunctionDescriptor RprQueryPipeline_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprQueryPipeline_drop$MH = RuntimeHelper.downcallHandle(
        "RprQueryPipeline_drop",
        constants$59.RprQueryPipeline_drop$FUNC
    );
    static final FunctionDescriptor RprQueryPipeline_intersection_with_ray$callback$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("index"),
                Constants$root.C_INT$LAYOUT.withName("generation")
            ).withName("collider"),
            Constants$root.C_FLOAT$LAYOUT.withName("toi"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y")
            ).withName("normal"),
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("tag"),
                MemoryLayout.unionLayout(
                    MemoryLayout.structLayout(
                        Constants$root.C_INT$LAYOUT.withName("id")
                    ).withName("vertex"),
                    MemoryLayout.structLayout(
                        Constants$root.C_INT$LAYOUT.withName("id")
                    ).withName("face")
                ).withName("$anon$0")
            ).withName("feature")
        ).withName("RprComplexRayResult")
    );
}


