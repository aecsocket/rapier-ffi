// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * _Bool (*RprQueryPipeline_intersection_with_ray$callback)(struct RprComplexRayResult);
 * }
 */
public interface RprQueryPipeline_intersection_with_ray$callback {

    boolean apply(java.lang.foreign.MemorySegment _x0);
    static MemorySegment allocate(RprQueryPipeline_intersection_with_ray$callback fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(RprQueryPipeline_intersection_with_ray$callback.class, fi, constants$59.RprQueryPipeline_intersection_with_ray$callback$FUNC, scope);
    }
    static RprQueryPipeline_intersection_with_ray$callback ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0) -> {
            try {
                return (boolean)constants$59.RprQueryPipeline_intersection_with_ray$callback$MH.invokeExact(symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


