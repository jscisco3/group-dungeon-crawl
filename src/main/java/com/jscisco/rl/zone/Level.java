package com.jscisco.rl.zone;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * This is a specific level, or floor, for a zone (aka Instance Dungeon). It contains the relevant
 * information necessary for the level to function. That probably includes a World instance.
 *
 * TODO: should each level have it's own World?
 */
public class Level {
    Terrain[][] terrain;

    public Level(Terrain[][] terrain) {
        this.terrain = terrain;
    }

    public void draw(SpriteBatch batch) {
        for (int x = 0; x < terrain.length; x++) {
            for (int y = 0; y < terrain[x].length; y++) {
                terrain[x][y].draw(batch, x, y);
            }
        }
    }
}
