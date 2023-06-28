// Generated by jextract

package rapier.sys;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class RprRigidBodyAdditionalMassProps {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("tag"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.structLayout(
                        Constants$root.C_FLOAT$LAYOUT.withName("x"),
                        Constants$root.C_FLOAT$LAYOUT.withName("y")
                    ).withName("local_com"),
                    Constants$root.C_FLOAT$LAYOUT.withName("inv_mass"),
                    MemoryLayout.structLayout(
                        Constants$root.C_FLOAT$LAYOUT.withName("x")
                    ).withName("inv_principal_inertia_sqrt")
                ).withName("mass_props")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                Constants$root.C_FLOAT$LAYOUT.withName("mass")
            ).withName("$anon$1")
        ).withName("$anon$0")
    ).withName("RprRigidBodyAdditionalMassProps");
    public static MemoryLayout $LAYOUT() {
        return RprRigidBodyAdditionalMassProps.$struct$LAYOUT;
    }
    static final VarHandle tag$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("tag"));
    public static VarHandle tag$VH() {
        return RprRigidBodyAdditionalMassProps.tag$VH;
    }
    public static int tag$get(MemorySegment seg) {
        return (int)RprRigidBodyAdditionalMassProps.tag$VH.get(seg);
    }
    public static void tag$set( MemorySegment seg, int x) {
        RprRigidBodyAdditionalMassProps.tag$VH.set(seg, x);
    }
    public static int tag$get(MemorySegment seg, long index) {
        return (int)RprRigidBodyAdditionalMassProps.tag$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void tag$set(MemorySegment seg, long index, int x) {
        RprRigidBodyAdditionalMassProps.tag$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment mass_props$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    static final VarHandle mass$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("mass"));
    public static VarHandle mass$VH() {
        return RprRigidBodyAdditionalMassProps.mass$VH;
    }
    public static float mass$get(MemorySegment seg) {
        return (float)RprRigidBodyAdditionalMassProps.mass$VH.get(seg);
    }
    public static void mass$set( MemorySegment seg, float x) {
        RprRigidBodyAdditionalMassProps.mass$VH.set(seg, x);
    }
    public static float mass$get(MemorySegment seg, long index) {
        return (float)RprRigidBodyAdditionalMassProps.mass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mass$set(MemorySegment seg, long index, float x) {
        RprRigidBodyAdditionalMassProps.mass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


