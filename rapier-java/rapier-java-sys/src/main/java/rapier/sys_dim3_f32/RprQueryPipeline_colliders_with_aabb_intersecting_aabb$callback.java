// Generated by jextract

package rapier.sys_dim3_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * _Bool (*RprQueryPipeline_colliders_with_aabb_intersecting_aabb$callback)(struct RprArenaKey);
 * }
 */
public interface RprQueryPipeline_colliders_with_aabb_intersecting_aabb$callback {

    boolean apply(java.lang.foreign.MemorySegment _x0);
    static MemorySegment allocate(RprQueryPipeline_colliders_with_aabb_intersecting_aabb$callback fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(RprQueryPipeline_colliders_with_aabb_intersecting_aabb$callback.class, fi, constants$61.RprQueryPipeline_colliders_with_aabb_intersecting_aabb$callback$FUNC, scope);
    }
    static RprQueryPipeline_colliders_with_aabb_intersecting_aabb$callback ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0) -> {
            try {
                return (boolean)constants$61.RprQueryPipeline_colliders_with_aabb_intersecting_aabb$callback$MH.invokeExact(symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


