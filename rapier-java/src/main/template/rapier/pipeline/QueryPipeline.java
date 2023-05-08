package rapier.pipeline;

import rapier.DroppableNative;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class QueryPipeline extends DroppableNative {
    protected QueryPipeline(MemorySegment memory) {
        super(memory);
    }

    public static QueryPipeline at(MemorySegment memory) {
        return new QueryPipeline(memory);
    }

    public static QueryPipeline create() {
        return at(RprQueryPipeline_new());
    }

    @Override
    protected void dropInternal() {
        RprQueryPipeline_drop(self);
    }
}
