// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * void (*at_quick_exit$__func)();
 * }
 */
public interface at_quick_exit$__func {

    void apply();
    static MemorySegment allocate(at_quick_exit$__func fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(at_quick_exit$__func.class, fi, constants$10.at_quick_exit$__func$FUNC, scope);
    }
    static at_quick_exit$__func ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return () -> {
            try {
                constants$10.at_quick_exit$__func$MH.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


