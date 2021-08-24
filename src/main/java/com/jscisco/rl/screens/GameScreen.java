package com.jscisco.rl.screens;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jscisco.rl.application.Game;
import com.jscisco.rl.zone.Level;
import com.jscisco.rl.zone.LevelFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GameScreen extends AbstractScreen {

    private Level level;

    public GameScreen(Game game, SpriteBatch batch) {
        super(game, batch);
        this.level = LevelFactory.emptyLevel(25, 25);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        batch.begin();
        level.draw(batch);
        batch.end();
    }
}
