package com.paranoidalien.game.entities;

import com.paranoidalien.game.asteroids.Game;

/**
 * Project: Asteroids
 * Created by Adam on 18 at 9:20 PM.
 */
public class SpaceObject {

    protected float x;
    protected float y;

    protected float dx;
    protected float dy;

    protected float radians;
    protected float speed;
    protected float rotationSpeed;

    protected int width;
    protected int height;

    protected float[] shapex;
    protected float[] shapey;

    protected void wrap() {
        if (x < 0) x = Game.WIDTH;
        if (x > Game.WIDTH) x = 0;
        if (y < 0) y = Game.HEIGHT;
        if (y > Game.HEIGHT) y = 0;
    }

}
