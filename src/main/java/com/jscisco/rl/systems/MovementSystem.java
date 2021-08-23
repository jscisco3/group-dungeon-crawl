package com.jscisco.rl.systems;

import com.artemis.ComponentMapper;
import com.artemis.annotations.All;
import com.artemis.systems.IteratingSystem;
import com.jscisco.rl.components.MovementComponent;
import com.jscisco.rl.components.PositionComponent;

@All({MovementComponent.class, PositionComponent.class})
public class MovementSystem extends IteratingSystem {

    private ComponentMapper<PositionComponent> pcm;
    private ComponentMapper<MovementComponent> mcm;


    @Override
    protected void process(int entityId) {
        PositionComponent position = pcm.get(entityId);
        MovementComponent movement = mcm.get(entityId);
        position.setPosition(movement.getNewPosition());
    }

}
