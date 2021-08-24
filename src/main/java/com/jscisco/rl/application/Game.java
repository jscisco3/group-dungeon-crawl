package com.jscisco.rl.application;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jscisco.rl.screens.GameScreen;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Game extends ApplicationAdapter {

    SpriteBatch batch;
    Screen screen;

    public Game() {

    }

    public Game(SpriteBatch batch) {
        this.batch = batch;
    }

    @Override
    public void create() {
        this.batch = new SpriteBatch();
        log.info("Setting screen...");
        this.setScreen(new GameScreen(this, batch));
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
