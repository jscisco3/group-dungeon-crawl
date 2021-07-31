package com.jscisco.rl.systems;

import com.artemis.BaseEntitySystem;
import com.artemis.ComponentMapper;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.jscisco.rl.components.Renderable;
import com.jscisco.rl.components.TextureReference;

import static com.artemis.Aspect.all;

/**
 * This system is responsible for converting the TextureReference component on an
 * entity to a Renderable component. We do not want to serialize an entire Sprite,
 * so instead we serialize a reference, which is then derefenced by this system.
 */
public class TextureResolver extends BaseEntitySystem {
    ComponentMapper<Renderable> rcm;
    ComponentMapper<TextureReference> trcm;

    public TextureResolver() {
        super(all(TextureReference.class).exclude(Renderable.class));
    }

    @Override
    protected void processSystem() {

    }

    @Override
    public void inserted(int entity) {
        // TODO: Fix
        rcm.create(entity).setSprite(new Sprite(new Texture(trcm.get(entity).getTextureReference())));
    }
}
