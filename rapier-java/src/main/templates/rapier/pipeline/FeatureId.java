package rapier.pipeline;

import java.lang.foreign.MemorySegment;

public sealed interface FeatureId {
    record Vertex(int id) implements FeatureId {}

/*{% if dim3 %}*/
    record Edge(int id) implements FeatureId {}
/*{% endif %}*/

    record Face(int id) implements FeatureId {}

    final class Unknown implements FeatureId {
        private Unknown() {}

        public static final Unknown INSTANCE = new Unknown();
    }

    static FeatureId from(MemorySegment memory) {
        var tag = rapier.sys.RprFeatureId.tag$get(memory);
        return switch (tag) {
            case 0 -> {
                var body = rapier.sys.RprFeatureId.vertex$slice(memory);
                yield new Vertex(
                        rapier.sys.Vertex_Body.id$get(body)
                );
            }
/*{% if dim2 %}*/
            case 1 -> {
                var body = rapier.sys.RprFeatureId.face$slice(memory);
                yield new Face(
                        rapier.sys.Face_Body.id$get(body)
                );
            }
/*{% else %}*/
            case 1 -> {
                var body = rapier.sys_dim3.RprFeatureId.edge$slice(memory);
                yield new Edge(
                        rapier.sys_dim3.Edge_Body.id$get(body)
                );
            }
            case 2 -> {
                var body = rapier.sys.RprFeatureId.face$slice(memory);
                yield new Face(
                        rapier.sys.Face_Body.id$get(body)
                );
            }
/*{% endif %}*/
            default -> throw new IllegalArgumentException("Invalid tag " + tag);
        };
    }
}
