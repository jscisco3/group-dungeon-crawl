package com.jscisco.rl.systems;

import com.artemis.ComponentMapper;
import com.artemis.World;
import com.artemis.WorldConfiguration;
import com.artemis.WorldConfigurationBuilder;
import com.jscisco.rl.components.MovementComponent;
import com.jscisco.rl.components.PositionComponent;
import com.jscisco.rl.domain.Position;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MovementSystemTest {

    World world;
    ComponentMapper<PositionComponent> pcm;
    ComponentMapper<MovementComponent> mcm;

    @BeforeEach
    public void setup() {
        WorldConfiguration config = new WorldConfigurationBuilder()
                .with(
                        new MovementSystem()
                ).build();
        world = new World(config);
        pcm = world.getMapper(PositionComponent.class);
        mcm = world.getMapper(MovementComponent.class);
    }

    @Test
    public void entityWithMovementAndPositionComponents_isMovedWhenEngineTicks() {
        int e = world.create();

        PositionComponent p = pcm.create(e);
        p.setPosition(Position.of(1, 1));
        MovementComponent m = mcm.create(e);
        m.setNewPosition(Position.of(5, 5));

        world.process();

        assertThat(pcm.get(e).getPosition()).isEqualTo(Position.of(5, 5));
    }

}
