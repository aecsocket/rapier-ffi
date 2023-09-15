package rapier;

import javax.annotation.Nullable;
import java.lang.foreign.*;
import java.util.function.Function;
import java.util.function.IntFunction;

public interface Native {
    MemorySegment memory();

    static MemorySegment memoryOrNull(@Nullable Native obj) {
        return obj == null ? MemorySegment.NULL : obj.memory();
    }

    static MemorySegment allocPtrSlice(SegmentAllocator alloc, Native... objs) {
        var memory = alloc.allocateArray(ValueLayout.ADDRESS, objs.length);
        for (int i = 0; i < objs.length; i++) {
            memory.setAtIndex(ValueLayout.ADDRESS, i, memoryOrNull(objs[i]));
        }
        return memory;
    }

    static <T extends Native> T[] fromPtrSlice(
            MemorySegment data,
            int len,
            IntFunction<T[]> createArray,
            Function<MemorySegment, T> map
    ) {
        var ptrSize = ValueLayout.ADDRESS.byteSize();
        var res = createArray.apply(len);
        for (int i = 0; i < len; i++) {
            var elem = data.asSlice(ptrSize * i).get(ValueLayout.ADDRESS, 0);
            res[i] = map.apply(elem);
        }
        return res;
    }
}
