package rapier.pipeline;

import rapier.data.ArenaKey;
import rapier.sys.*;

import java.lang.foreign.MemorySegment;

public sealed interface FeatureId {
    record Vertex(int id) implements FeatureId {}

{% if dim3 %}
    record Edge(int id) implements FeatureId {}
{% endif %}

    record Face(int id) implements FeatureId {}

    final class Unknown implements FeatureId {
        private Unknown() {}

        public static final Unknown INSTANCE = new Unknown();
    }

    static FeatureId from(MemorySegment memory) {
        var tag = {{ sys }}.RprFeatureId.tag$get(memory);
        return switch (tag) {
            case 0 -> {
                var body = {{ sys }}.RprFeatureId.vertex$slice(memory);
                yield new Vertex(
                        {{ sys }}.Vertex_Body.id$get(body)
                );
            }
{% if dim2 %}
            case 1 -> {
                var body = {{ sys }}.RprFeatureId.face$slice(memory);
                yield new Face(
                        {{ sys }}.Face_Body.id$get(body)
                );
            }
{% else %}
            case 1 -> {
                var body = {{ sys }}.RprFeatureId.edge$slice(memory);
                yield new Edge(
                        {{ sys }}.Edge_Body.id$get(body)
                );
            }
            case 2 -> {
                var body = {{ sys }}.RprFeatureId.face$slice(memory);
                yield new Face(
                        {{ sys }}.Face_Body.id$get(body)
                );
            }
{% endif %}
            default -> throw new IllegalArgumentException("Invalid tag " + tag);
        };
    }
}
