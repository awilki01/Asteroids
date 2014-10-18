package com.paranoidalien.game.gamestates;

import com.paranoidalien.game.managers.GameStateManager;

/**
 * Project: Asteroids
 * Created by Adam on 18 at 5:23 PM.
 */
public class PlayState extends GameState{

    public PlayState (GameStateManager gsm){
        super(gsm);
        init();
    }

    @Override
    public void init() {

    }

    @Override
    public void update(float dt) {
        System.out.println("PlayState updating");
    }

    @Override
    public void draw() {
        System.out.println("PlayState drawing");
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void dispose() {

    }

}
