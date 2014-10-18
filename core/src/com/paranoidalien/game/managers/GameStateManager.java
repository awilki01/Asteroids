package com.paranoidalien.game.managers;

import com.paranoidalien.game.gamestates.GameState;
import com.paranoidalien.game.gamestates.PlayState;

/**
 * Project: Asteroids
 * Created by Adam on 18 at 4:43 PM.
 */
public class GameStateManager {

    // Current game state
    private GameState gameState;

    public static final int MENU = 0;
    public static final int PLAY = 893746; // Can use any number

    public GameStateManager() {
        setState(PLAY);
    }

    public void setState(int state) {
        if(gameState != null) {
            gameState.dispose();
        }

        if (state == MENU) {
            // gameState = new MenuState(this);
        }
        if (state == PLAY) {
            gameState = new PlayState(this);
        }
    }

    public void update (float dt){
        gameState.update(dt);
    }

    public void draw() {
        gameState.draw();
    }




}
