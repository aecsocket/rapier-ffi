package rapier.shape;

import rapier.ValNative;
import rapier.math.*;
import rapier.sys.RprCompoundChild;
import rapier.sys.RprVector;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class CompoundChild extends ValNative {
    private CompoundChild(MemorySegment memory) {
        super(memory);
    }

    public static CompoundChild at(MemorySegment memory) {
        return new CompoundChild(memory);
    }

    public static CompoundChild of(SegmentAllocator alloc, Isometry delta, SharedShape shape) {
        var memory = {{ sys }}.RprCompoundChild.allocate(alloc);
        {{ sys }}.RprCompoundChild.delta$slice(memory).copyFrom(delta.memory());
        {{ sys }}.RprCompoundChild.shape$set(memory, shape.memory());
        return at(memory);
    }

    public static MemorySegment allocateArray(SegmentAllocator alloc, CompoundChild... objs) {
        var memory = {{ sys }}.RprCompoundChild.allocateArray(objs.length, alloc);
        for (int i = 0; i < objs.length; i++) {
            var obj = objs[i];
            {{ sys }}.RprCompoundChild.delta$slice(memory, i).copyFrom(obj.getDelta().memory());
            {{ sys }}.RprCompoundChild.shape$set(memory, i, obj.getShape().memory());
        }
        return memory;
    }

    public Isometry getDelta() {
        return Isometry.at({{ sys }}.RprCompoundChild.delta$slice(self));
    }

    public void setDelta(Isometry delta) {
        {{ sys }}.RprCompoundChild.delta$slice(self).copyFrom(delta.memory());
    }

    public SharedShape getShape() {
        return SharedShape.at({{ sys }}.RprCompoundChild.shape$get(self));
    }

    public void setShape(SharedShape shape) {
        {{ sys }}.RprCompoundChild.shape$set(self, shape.memory());
    }
}
