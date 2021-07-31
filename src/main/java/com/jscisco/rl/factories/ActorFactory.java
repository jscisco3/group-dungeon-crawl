package com.jscisco.rl.factories;

import com.artemis.World;
import com.jscisco.rl.components.PositionComponent;
import com.jscisco.rl.components.TextureReference;
import com.jscisco.rl.domain.Position;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ActorFactory {

    public static int createActorAtPosition(World world,
                                            String textureReference,
                                            Position p) {
        int e = world.create();
        world.getMapper(PositionComponent.class).create(e).setPosition(p);
        world.getMapper(TextureReference.class).create(e).setTextureReference(textureReference);
        log.info("Created renderable actor...");
        return e;
    }

}
