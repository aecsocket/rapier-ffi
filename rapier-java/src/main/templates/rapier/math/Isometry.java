package rapier.math;

import rapier.ValNative;
import rapier.sys.RprIsometry;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class Isometry extends ValNative {
    private Isometry(MemorySegment memory) {
        super(memory);
    }

    public static Isometry at(MemorySegment memory) {
        return new Isometry(memory);
    }

    public static Isometry of(SegmentAllocator alloc, Rotation rotation, Vector translation) {
        var memory = {{ sys }}.RprIsometry.allocate(alloc);
        {{ sys }}.RprIsometry.rotation$slice(memory).copyFrom(rotation.memory());
        {{ sys }}.RprIsometry.translation$slice(memory).copyFrom(translation.memory());
        return at(memory);
    }

    public static Isometry create(SegmentAllocator alloc) {
        return at({{ sys }}.RprIsometry.allocate(alloc));
    }

    public Rotation getRotation() {
        return Rotation.at({{ sys }}.RprIsometry.rotation$slice(self));
    }

    public void setRotation(Rotation rotation) {
        {{ sys }}.RprIsometry.rotation$slice(self).copyFrom(rotation.memory());
    }

    public Vector getTranslation() {
        return Vector.at({{ sys }}.RprIsometry.translation$slice(self));
    }

    public void setTranslation(Vector translation) {
        {{ sys }}.RprIsometry.translation$slice(self).copyFrom(translation.memory());
    }

    @Override
    public String toString() {
        return "Iso[%s, %s]".formatted(getTranslation(), getRotation());
    }
}
