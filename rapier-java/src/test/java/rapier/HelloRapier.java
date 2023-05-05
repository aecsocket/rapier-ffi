package rapier;

import org.junit.jupiter.api.Test;
import rapier.dynamics.IntegrationParameters;
import rapier.pipeline.PhysicsPipeline;

public final class HelloRapier {
    @Test
    public void helloRapier() {
        Rapier.load();

        var pipeline = PhysicsPipelineD3.create();
        var integrationParameters = IntegrationParametersD3.create(

        )

        pipeline.drop();
    }
}
