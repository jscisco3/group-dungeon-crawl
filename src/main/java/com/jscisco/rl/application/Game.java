package com.jscisco.rl.application;

import com.artemis.World;
import com.artemis.WorldConfiguration;
import com.artemis.WorldConfigurationBuilder;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Game extends ApplicationAdapter {

    final SpriteBatch batch;
    final World world;
    Screen screen;

    public Game(World world, SpriteBatch batch) {
        this.batch = batch;
        this.world = world;
    }

    @Override
    public void create() {

    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
        screen.show();
    }

}
