package com.paranoidalien.game.gamestates;

import com.paranoidalien.game.managers.GameStateManager;

/**
 * Project: Asteroids
 * Created by Adam on 18 at 4:45 PM.
 */

// Abstract class and methods:
// http://www.programmerinterview.com/index.php/java-questions/interface-vs-abstract-class/

public abstract class GameState {

    protected GameStateManager gsm;

    protected GameState(GameStateManager gsm) {
        this.gsm = gsm;
        init();
    }

    public abstract void init();
    public abstract void update(float dt);
    public abstract void draw();
    public abstract void handleInput();
    public abstract void dispose();

}
