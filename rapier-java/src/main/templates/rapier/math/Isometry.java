package rapier.math;

import rapier.Native;
import rapier.sys.RprIso;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class Isometry extends Native {
    protected Isometry(MemorySegment memory) {
        super(memory);
    }

    public static Isometry at(MemorySegment memory) {
        return new Isometry(memory);
    }

    public static Isometry of(SegmentAllocator alloc, Rotation rotation, Vector translation) {
        var memory = {{ sys }}.RprIso.allocate(alloc);
        {{ sys }}.RprIso.rotation$slice(memory).copyFrom(rotation.memory());
        {{ sys }}.RprIso.translation$slice(memory).copyFrom(translation.memory());
        return at(memory);
    }

    public Rotation getRotation() {
        return Rotation.at({{ sys }}.RprIso.rotation$slice(self));
    }

    public void setRotation(Rotation rotation) {
        {{ sys }}.RprIso.rotation$slice(self).copyFrom(rotation.memory());
    }

    public Vector getTranslation() {
        return Vector.at({{ sys }}.RprIso.translation$slice(self));
    }

    public void setTranslation(Vector translation) {
        {{ sys }}.RprIso.translation$slice(self).copyFrom(translation.memory());
    }

    @Override
    public String toString() {
        return "Iso[%s, %s]".formatted(getTranslation(), getRotation());
    }
}
