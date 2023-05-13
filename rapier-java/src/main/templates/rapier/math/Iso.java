package rapier.math;

import rapier.Native;
import rapier.sys.RprIso;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class Iso extends Native {
    protected Iso(MemorySegment memory) {
        super(memory);
    }

    public static Iso at(MemorySegment memory) {
        return new Iso(memory);
    }

    public static Iso of(SegmentAllocator alloc, {{ realRot }} rotation, {{ realVec }} translation) {
        var memory = {{ sys }}.RprIso.allocate(alloc);
        {{ sys }}.RprIso.rotation$slice(memory).copyFrom(rotation.memory());
        {{ sys }}.RprIso.translation$slice(memory).copyFrom(translation.memory());
        return at(memory);
    }

    public {{ realRot }} getRotation() {
        return {{ realRot }}.at({{ sys }}.RprIso.rotation$slice(self));
    }

    public void setRotation({{ realRot }} rotation) {
        {{ sys }}.RprIso.rotation$slice(self).copyFrom(rotation.memory());
    }

    public {{ realVec }} getTranslation() {
        return {{ realVec }}.at({{ sys }}.RprIso.translation$slice(self));
    }

    public void setTranslation({{ realVec }} translation) {
        {{ sys }}.RprIso.translation$slice(self).copyFrom(translation.memory());
    }

    @Override
    public String toString() {
        return "Iso[%s, %s]".formatted(getTranslation(), getRotation());
    }
}
