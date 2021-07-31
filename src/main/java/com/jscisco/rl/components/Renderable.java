package com.jscisco.rl.components;

import com.artemis.Component;
import com.artemis.annotations.Transient;
import com.badlogic.gdx.graphics.g2d.Sprite;

@Transient
public class Renderable extends Component {

    private Sprite sprite;

    public Renderable() {
    }

    public Renderable(Sprite sprite) {
        this.sprite = sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    public Sprite getSprite() {
        return sprite;
    }
}
