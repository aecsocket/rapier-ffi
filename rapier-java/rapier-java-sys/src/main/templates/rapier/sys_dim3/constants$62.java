// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$62 {

    static final FunctionDescriptor RprQueryPipeline_intersection_with_ray$callback$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("index"),
                Constants$root.C_INT$LAYOUT.withName("generation")
            ).withName("collider"),
            Constants$root.C_FLOAT$LAYOUT.withName("toi"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y"),
                Constants$root.C_FLOAT$LAYOUT.withName("z")
            ).withName("normal"),
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("tag"),
                MemoryLayout.unionLayout(
                    MemoryLayout.structLayout(
                        Constants$root.C_INT$LAYOUT.withName("id")
                    ).withName("vertex"),
                    MemoryLayout.structLayout(
                        Constants$root.C_INT$LAYOUT.withName("id")
                    ).withName("edge"),
                    MemoryLayout.structLayout(
                        Constants$root.C_INT$LAYOUT.withName("id")
                    ).withName("face")
                ).withName("$anon$0")
            ).withName("feature")
        ).withName("RprComplexRayResult")
    );
    static final MethodHandle RprQueryPipeline_intersection_with_ray$callback$MH = RuntimeHelper.downcallHandle(
        constants$62.RprQueryPipeline_intersection_with_ray$callback$FUNC
    );
    static final FunctionDescriptor RprQueryPipeline_intersection_with_ray$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y"),
                Constants$root.C_FLOAT$LAYOUT.withName("z")
            ).withName("origin"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y"),
                Constants$root.C_FLOAT$LAYOUT.withName("z")
            ).withName("dir")
        ).withName("RprRay"),
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
    static final MethodHandle RprQueryPipeline_intersection_with_ray$MH = RuntimeHelper.downcallHandle(
        "RprQueryPipeline_intersection_with_ray",
        constants$62.RprQueryPipeline_intersection_with_ray$FUNC
    );
    static final FunctionDescriptor RprQueryPipeline_intersection_with_shape$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y"),
                Constants$root.C_FLOAT$LAYOUT.withName("z"),
                Constants$root.C_FLOAT$LAYOUT.withName("w")
            ).withName("rotation"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("x"),
                Constants$root.C_FLOAT$LAYOUT.withName("y"),
                Constants$root.C_FLOAT$LAYOUT.withName("z")
            ).withName("translation")
        ).withName("RprIsometry"),
        Constants$root.C_POINTER$LAYOUT,
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
    static final MethodHandle RprQueryPipeline_intersection_with_shape$MH = RuntimeHelper.downcallHandle(
        "RprQueryPipeline_intersection_with_shape",
        constants$62.RprQueryPipeline_intersection_with_shape$FUNC
    );
    static final FunctionDescriptor RprQueryPipeline_intersections_with_point$callback$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprQueryPipeline_intersections_with_point$callback$MH = RuntimeHelper.downcallHandle(
        constants$62.RprQueryPipeline_intersections_with_point$callback$FUNC
    );
}

