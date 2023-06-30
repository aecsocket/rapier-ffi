// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$58 {

    static final FunctionDescriptor RprQueryPipeline_colliders_with_aabb_intersecting_aabb$callback$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprQueryPipeline_colliders_with_aabb_intersecting_aabb$callback$MH = RuntimeHelper.downcallHandle(
        constants$58.RprQueryPipeline_colliders_with_aabb_intersecting_aabb$callback$FUNC
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
        constants$58.RprQueryPipeline_colliders_with_aabb_intersecting_aabb$FUNC
    );
    static final FunctionDescriptor RprQueryPipeline_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprQueryPipeline_drop$MH = RuntimeHelper.downcallHandle(
        "RprQueryPipeline_drop",
        constants$58.RprQueryPipeline_drop$FUNC
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
    static final MethodHandle RprQueryPipeline_intersection_with_ray$callback$MH = RuntimeHelper.downcallHandle(
        constants$58.RprQueryPipeline_intersection_with_ray$callback$FUNC
    );
}


