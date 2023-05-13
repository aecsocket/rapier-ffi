package rapier.pipeline;

import rapier.BaseNative;
import rapier.DropFlag;
import rapier.Droppable;

import java.lang.foreign.MemorySegment;

import static rapier.sys.RapierC.*;

public final class QueryPipeline extends BaseNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprQueryPipeline_drop(self));
    }

    protected QueryPipeline(MemorySegment memory) {
        super(memory);
    }

    public static QueryPipeline at(MemorySegment memory) {
        return new QueryPipeline(memory);
    }

    public static QueryPipeline create() {
        return at(RprQueryPipeline_new());
    }

}
