// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface on_exit$__func {

    void apply(int _x0, java.lang.foreign.MemoryAddress _x1);
    static MemorySegment allocate(on_exit$__func fi, MemorySession session) {
        return RuntimeHelper.upcallStub(on_exit$__func.class, fi, constants$11.on_exit$__func$FUNC, session);
    }
    static on_exit$__func ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (int __x0, java.lang.foreign.MemoryAddress __x1) -> {
            try {
                constants$12.on_exit$__func$MH.invokeExact((Addressable)symbol, __x0, (java.lang.foreign.Addressable)__x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


