// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$61 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$61() {}
    static final FunctionDescriptor RprQueryPipeline_colliders_with_aabb_intersecting_aabb$callback$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("index"),
            Constants$root.C_INT$LAYOUT.withName("generation")
        ).withName("RprArenaKey")
    );
    static final MethodHandle RprQueryPipeline_colliders_with_aabb_intersecting_aabb$callback$MH = RuntimeHelper.downcallHandle(
        constants$61.RprQueryPipeline_colliders_with_aabb_intersecting_aabb$callback$FUNC
    );
    static final FunctionDescriptor RprQueryPipeline_colliders_with_aabb_intersecting_aabb$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y"),
                Constants$root.C_DOUBLE$LAYOUT.withName("z")
            ).withName("min"),
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y"),
                Constants$root.C_DOUBLE$LAYOUT.withName("z")
            ).withName("max")
        ).withName("RprAabb"),
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprQueryPipeline_colliders_with_aabb_intersecting_aabb$MH = RuntimeHelper.downcallHandle(
        "RprQueryPipeline_colliders_with_aabb_intersecting_aabb",
        constants$61.RprQueryPipeline_colliders_with_aabb_intersecting_aabb$FUNC
    );
    static final FunctionDescriptor RprQueryPipeline_drop$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RprQueryPipeline_drop$MH = RuntimeHelper.downcallHandle(
        "RprQueryPipeline_drop",
        constants$61.RprQueryPipeline_drop$FUNC
    );
    static final FunctionDescriptor RprQueryPipeline_intersection_with_ray$callback$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                Constants$root.C_INT$LAYOUT.withName("index"),
                Constants$root.C_INT$LAYOUT.withName("generation")
            ).withName("collider"),
            Constants$root.C_DOUBLE$LAYOUT.withName("toi"),
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                Constants$root.C_DOUBLE$LAYOUT.withName("y"),
                Constants$root.C_DOUBLE$LAYOUT.withName("z")
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
                ).withName("union (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:1142:3)")
            ).withName("feature")
        ).withName("RprComplexRayResult")
    );
    static final MethodHandle RprQueryPipeline_intersection_with_ray$callback$MH = RuntimeHelper.downcallHandle(
        constants$61.RprQueryPipeline_intersection_with_ray$callback$FUNC
    );
}


