package rapier.pipeline;

import rapier.DropFlag;
import rapier.Droppable;
import rapier.RefNative;

import java.lang.foreign.MemoryAddress;

import static rapier.sys.RapierC.*;

public final class QueryPipeline extends RefNative implements Droppable {
    private final DropFlag dropped = new DropFlag();

    @Override
    public void drop() {
        dropped.drop(() -> RprQueryPipeline_drop(self));
    }

    private QueryPipeline(MemoryAddress memory) {
        super(memory);
    }

    public static QueryPipeline at(MemoryAddress memory) {
        return new QueryPipeline(memory);
    }

    public static QueryPipeline create() {
        return at(RprQueryPipeline_new());
    }

}
