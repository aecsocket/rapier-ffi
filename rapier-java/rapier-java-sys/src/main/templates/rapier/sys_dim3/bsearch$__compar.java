// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * int (*bsearch$__compar)(void*,void*);
 * }
 */
public interface bsearch$__compar {

    int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
    static MemorySegment allocate(bsearch$__compar fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(bsearch$__compar.class, fi, constants$14.bsearch$__compar$FUNC, scope);
    }
    static bsearch$__compar ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
            try {
                return (int)constants$14.bsearch$__compar$MH.invokeExact(symbol, __x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


