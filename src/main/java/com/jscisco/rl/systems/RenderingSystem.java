package com.jscisco.rl.systems;

import com.artemis.ComponentMapper;
import com.artemis.annotations.All;
import com.artemis.systems.IteratingSystem;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jscisco.rl.components.PositionComponent;
import com.jscisco.rl.components.Renderable;
import com.jscisco.rl.domain.Position;

@All({PositionComponent.class, Renderable.class})
public class RenderingSystem extends IteratingSystem {

    private ComponentMapper<PositionComponent> pcm;
    private ComponentMapper<Renderable> rcm;
    private SpriteBatch batch;

    public RenderingSystem(SpriteBatch batch) {
        this.batch = batch;
    }


    @Override
    protected void process(int entityId) {
        Position position = pcm.get(entityId).getPosition();
        Sprite sprite = rcm.get(entityId).getSprite();

        batch.draw(sprite,
                position.getX() * sprite.getWidth(),
                position.getY() * sprite.getHeight()
        );
    }
}
