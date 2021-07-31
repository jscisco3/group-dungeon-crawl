package com.jscisco.rl.zone;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class TerrainFactory {

    public static Terrain floor() {
        Terrain t = new Terrain();
        t.blocksSight = false;
        t.walkable = true;
        t.sprite = new Sprite(new Texture("floor.png"));
        return t;
    }

    public static Terrain wall() {
        Terrain t = new Terrain();
        t.blocksSight = true;
        t.walkable = false;
        t.sprite = new Sprite(new Texture("wall.png"));
        return t;
    }

}
