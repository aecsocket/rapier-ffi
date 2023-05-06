package rapier;

import org.junit.jupiter.api.Test;
import rapier.dynamics.IntegrationParameters;
import rapier.dynamics.IslandManager;
import rapier.math.Vector3;
import rapier.pipeline.PhysicsPipeline;

import java.lang.foreign.Arena;

public final class HelloRapier {
    @Test
    public void helloRapier() {
        Rapier.load();

        try (var arena = Arena.openConfined()) {
            var pipeline = PhysicsPipeline.create();
            var gravity = Vector3.create(arena, 0.0, -9.81, 0.0);
            var integrationParameters = IntegrationParameters.ofDefault();
            var islands = IslandManager.create();
            pipeline.step(
                    gravity,
                    integrationParameters,
                    islands,
                    broadPhase,
                    narrowPhase,
                    rigidBodies,
                    colliders,
                    impulseJoints,
                    multibodyJoints,
                    ccdSolver,
                    queryPipeline
            );
            pipeline.drop();
        }
    }
}
