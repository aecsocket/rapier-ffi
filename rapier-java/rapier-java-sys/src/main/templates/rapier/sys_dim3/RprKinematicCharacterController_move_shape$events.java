// Generated by jextract

package rapier.sys_dim3;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public interface RprKinematicCharacterController_move_shape$events {

    void apply(java.lang.foreign.MemorySegment _x0);
    static MemorySegment allocate(RprKinematicCharacterController_move_shape$events fi, MemorySession session) {
        return RuntimeHelper.upcallStub(RprKinematicCharacterController_move_shape$events.class, fi, constants$55.RprKinematicCharacterController_move_shape$events$FUNC, session);
    }
    static RprKinematicCharacterController_move_shape$events ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemorySegment __x0) -> {
            try {
                constants$55.RprKinematicCharacterController_move_shape$events$MH.invokeExact((Addressable)symbol, __x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


