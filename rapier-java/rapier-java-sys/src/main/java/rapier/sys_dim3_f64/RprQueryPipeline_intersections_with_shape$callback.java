// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface RprQueryPipeline_intersections_with_shape$callback {

    boolean apply(java.lang.foreign.MemorySegment _x0);
    static MemorySegment allocate(RprQueryPipeline_intersections_with_shape$callback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(RprQueryPipeline_intersections_with_shape$callback.class, fi, constants$55.RprQueryPipeline_intersections_with_shape$callback$FUNC, session);
    }
    static RprQueryPipeline_intersections_with_shape$callback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemorySegment __x0) -> {
            try {
                return (boolean)constants$55.RprQueryPipeline_intersections_with_shape$callback$MH.invokeExact((Addressable)symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


