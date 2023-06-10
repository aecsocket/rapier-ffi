package rapier.pipeline;

import rapier.ValNative;
import rapier.data.ArenaKey;
import rapier.math.Vector;
import rapier.sys.RprTOI;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;

public final class TOI extends ValNative {
    private TOI(MemorySegment memory) {
        super(memory);
    }

    public static TOI at(MemorySegment memory) {
        return new TOI(memory);
    }

    public static TOI of(SegmentAllocator alloc) {
        return at({{ sys }}.RprTOI.allocate(alloc));
    }

    public {{ real }} getToi() {
        return {{ sys }}.RprTOI.toi$get(self);
    }

    public Vector getWitness1() {
        return Vector.at({{ sys }}.RprTOI.witness1$slice(self));
    }

    public Vector getWitness2() {
        return Vector.at({{ sys }}.RprTOI.witness2$slice(self));
    }

    public Vector getNormal1() {
        return Vector.at({{ sys }}.RprTOI.normal1$slice(self));
    }

    public Vector getNormal2() {
        return Vector.at({{ sys }}.RprTOI.normal2$slice(self));
    }

    public TOIStatus getStatus() {
        return TOIStatus.values()[{{ sys }}.RprTOI.status$get(self)];
    }
}
