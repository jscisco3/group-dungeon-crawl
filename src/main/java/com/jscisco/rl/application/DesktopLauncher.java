package com.jscisco.rl.application;

import com.artemis.World;
import com.artemis.WorldConfiguration;
import com.artemis.WorldConfigurationBuilder;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jscisco.rl.systems.RenderingSystem;
import com.jscisco.rl.systems.TextureResolver;

public class DesktopLauncher {

    public static void main(String[] args) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setIdleFPS(60);
        config.useVsync(true);
        config.setTitle("Party Roguelike");

        config.setWindowedMode(960, 640);

        SpriteBatch batch = spriteBatch();
        WorldConfiguration worldConfiguration = worldConfiguration(batch);
        World world = world(worldConfiguration);

        new Lwjgl3Application(new Game(world, batch), config);
    }

    public static SpriteBatch spriteBatch() {
        return new SpriteBatch();
    }

    public static WorldConfiguration worldConfiguration(SpriteBatch batch) {
        return new WorldConfigurationBuilder()
                .with(
                        new TextureResolver(),
                        new RenderingSystem(batch)
                ).build();
    }

    public static World world(WorldConfiguration worldConfiguration) {
        return new World(worldConfiguration);
    }

}
