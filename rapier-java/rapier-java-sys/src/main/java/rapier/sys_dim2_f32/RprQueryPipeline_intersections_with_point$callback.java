// Generated by jextract

package rapier.sys_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface RprQueryPipeline_intersections_with_point$callback {

    boolean apply(java.lang.foreign.MemorySegment _x0);
    static MemorySegment allocate(RprQueryPipeline_intersections_with_point$callback fi, MemorySession session) {
        return RuntimeHelper.upcallStub(RprQueryPipeline_intersections_with_point$callback.class, fi, constants$61.RprQueryPipeline_intersections_with_point$callback$FUNC, session);
    }
    static RprQueryPipeline_intersections_with_point$callback ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemorySegment __x0) -> {
            try {
                return (boolean)constants$61.RprQueryPipeline_intersections_with_point$callback$MH.invokeExact((Addressable)symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


