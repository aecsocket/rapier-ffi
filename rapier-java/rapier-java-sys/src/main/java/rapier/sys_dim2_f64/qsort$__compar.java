// Generated by jextract

package rapier.sys_dim2_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*qsort$__compar)(void*,void*);
 * }
 */
public interface qsort$__compar {

    int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
    static MemorySegment allocate(qsort$__compar fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(qsort$__compar.class, fi, constants$14.qsort$__compar$FUNC, scope);
    }
    static qsort$__compar ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
            try {
                return (int)constants$14.qsort$__compar$MH.invokeExact(symbol, __x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


