package com.jscisco.rl.application;

import com.artemis.World;
import com.artemis.WorldConfiguration;
import com.artemis.WorldConfigurationBuilder;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jscisco.rl.domain.Position;
import com.jscisco.rl.factories.ActorFactory;
import com.jscisco.rl.screens.GameScreen;
import com.jscisco.rl.systems.RenderingSystem;
import com.jscisco.rl.systems.TextureResolver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Game extends ApplicationAdapter {

    SpriteBatch batch;
    World world;
    Screen screen;

    public Game() {

    }

    public Game(World world, SpriteBatch batch) {
        this.batch = batch;
        this.world = world;
    }

    @Override
    public void create() {
        this.batch = new SpriteBatch();
        WorldConfiguration config = new WorldConfigurationBuilder()
                .with(
                        new TextureResolver(),
                        new RenderingSystem(batch)
                ).build();
        this.world = new World(config);
        int actor = ActorFactory.createActorAtPosition(this.world, "bat.png", new Position(5, 5));
        log.info("Setting screen...");
        this.setScreen(new GameScreen(this, batch, world));
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
        this.screen.show();
    }

    @Override
    public void render() {
        screen.render(Gdx.graphics.getDeltaTime());
    }

    @Override
    public void dispose() {
        batch.dispose();
    }

}
