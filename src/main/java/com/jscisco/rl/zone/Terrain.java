package com.jscisco.rl.zone;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * This represents the terrain on a given space. Oftentimes, an interesting
 * feature of a "tile" is actually going to be an Entity. This has the very
 * basic information required for terrain.
 */
public class Terrain {
    String spriteReference;
    Sprite sprite;
    boolean blocksSight;
    boolean walkable;

    public Terrain() {
    }

    public void draw(SpriteBatch batch, int x, int y) {
        batch.draw(sprite, x * sprite.getRegionWidth(), y * sprite.getRegionHeight());
    }

    public String getSpriteReference() {
        return spriteReference;
    }

    public void setSpriteReference(String spriteReference) {
        this.spriteReference = spriteReference;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    public boolean isBlocksSight() {
        return blocksSight;
    }

    public void setBlocksSight(boolean blocksSight) {
        this.blocksSight = blocksSight;
    }

    public boolean isWalkable() {
        return walkable;
    }

    public void setWalkable(boolean walkable) {
        this.walkable = walkable;
    }
}
