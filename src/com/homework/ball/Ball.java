package com.homework.ball;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public  Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float)(speed * Math.cos(Math.toRadians(direction)));
        this.yDelta = (float)(speed * Math.sin(Math.toRadians(direction)));
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public int getRadius() {
        return radius;
    }
    public float getxDelta() {
        return xDelta;
    }
    public float getyDelta() {
        return yDelta;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }
    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void move() {
        this.x += xDelta;
        this.y += yDelta;
    }
    public void reflectHorizontal() {
        this.xDelta = -this.xDelta;
    }
    public void reflectVertical() {
        this.yDelta = -this.yDelta;
    }

    @Override
    public String toString() {
        return ("Ball[(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]");
    }
}
