package com.jscisco.rl.systems;

/**
 * This system is responsible for converting the TextureReference component on an
 * entity to a Renderable component. We do not want to serialize an entire Sprite,
 * so instead we serialize a reference, which is then derefenced by this system.
 */
public class TextureResolver {

}
