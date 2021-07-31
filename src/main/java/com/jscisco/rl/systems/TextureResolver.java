package com.jscisco.rl.systems;

import com.artemis.BaseEntitySystem;
import com.artemis.ComponentMapper;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.jscisco.rl.components.Renderable;
import com.jscisco.rl.components.TextureReference;

import static com.artemis.Aspect.all;

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
