// Generated by jextract

package rapier.headers_dim2_f32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*on_exit$__func)(int,void*);
 * }
 */
public interface on_exit$__func {

    void apply(int _x0, java.lang.foreign.MemorySegment _x1);
    static MemorySegment allocate(on_exit$__func fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(on_exit$__func.class, fi, constants$10.on_exit$__func$FUNC, scope);
    }
    static on_exit$__func ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (int __x0, java.lang.foreign.MemorySegment __x1) -> {
            try {
                constants$11.on_exit$__func$MH.invokeExact(symbol, __x0, __x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


