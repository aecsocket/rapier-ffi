// Generated by jextract

package rapier.sys_dim3_f64;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct RprRigidBodyAdditionalMassProps {
 *     enum RprRigidBodyAdditionalMassProps_Tag tag;
 *     union union (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:1252:3) {
 *         struct MassProps_Body mass_props;
 *         struct Mass_Body mass;
 *     };
 * };
 * }
 */
public class RprRigidBodyAdditionalMassProps {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("tag"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                        Constants$root.C_DOUBLE$LAYOUT.withName("y"),
                        Constants$root.C_DOUBLE$LAYOUT.withName("z")
                    ).withName("local_com"),
                    Constants$root.C_DOUBLE$LAYOUT.withName("inv_mass"),
                    MemoryLayout.structLayout(
                        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                        Constants$root.C_DOUBLE$LAYOUT.withName("y"),
                        Constants$root.C_DOUBLE$LAYOUT.withName("z")
                    ).withName("inv_principal_inertia_sqrt"),
                    MemoryLayout.structLayout(
                        Constants$root.C_DOUBLE$LAYOUT.withName("x"),
                        Constants$root.C_DOUBLE$LAYOUT.withName("y"),
                        Constants$root.C_DOUBLE$LAYOUT.withName("z"),
                        Constants$root.C_DOUBLE$LAYOUT.withName("w")
                    ).withName("principal_inertia_local_frame")
                ).withName("props")
            ).withName("mass_props"),
            MemoryLayout.structLayout(
                Constants$root.C_DOUBLE$LAYOUT.withName("mass")
            ).withName("mass")
        ).withName("union (anonymous at /home/socket/Projects/rapier-ffi/rapier-java/rapier-java-sys/build/librapier.h:1252:3)")
    ).withName("RprRigidBodyAdditionalMassProps");
    public static MemoryLayout $LAYOUT() {
        return RprRigidBodyAdditionalMassProps.$struct$LAYOUT;
    }
    static final VarHandle tag$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tag"));
    public static VarHandle tag$VH() {
        return RprRigidBodyAdditionalMassProps.tag$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum RprRigidBodyAdditionalMassProps_Tag tag;
     * }
     */
    public static int tag$get(MemorySegment seg) {
        return (int)RprRigidBodyAdditionalMassProps.tag$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum RprRigidBodyAdditionalMassProps_Tag tag;
     * }
     */
    public static void tag$set(MemorySegment seg, int x) {
        RprRigidBodyAdditionalMassProps.tag$VH.set(seg, x);
    }
    public static int tag$get(MemorySegment seg, long index) {
        return (int)RprRigidBodyAdditionalMassProps.tag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tag$set(MemorySegment seg, long index, int x) {
        RprRigidBodyAdditionalMassProps.tag$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


