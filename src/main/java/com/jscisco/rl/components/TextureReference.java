package com.jscisco.rl.components;

import com.artemis.Component;

/**
 * This is a reference used to locate the particular Sprite that a given entity should have
 */
public class TextureReference extends Component {
    String textureReference;

    public TextureReference() {
    }

    public TextureReference(String textureReference) {
        this.textureReference = textureReference;
    }

    public String getTextureReference() {
        return textureReference;
    }

    public void setTextureReference(String textureReference) {
        this.textureReference = textureReference;
    }
}
