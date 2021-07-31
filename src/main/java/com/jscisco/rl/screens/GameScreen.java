package com.jscisco.rl.screens;

import com.artemis.World;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jscisco.rl.application.Game;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GameScreen extends AbstractScreen {

    private final World world;

    public GameScreen(Game game, SpriteBatch batch, World world) {
        super(game, batch);
        this.world = world;
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        world.setDelta(delta);
        batch.begin();
        world.process();
        batch.end();
    }
}
