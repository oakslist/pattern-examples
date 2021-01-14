package com.pattern.examples.creational.prototype.basic;

public abstract class Shape {
    private int x;
    private int y;
    private String color;

    public Shape () {
    }

    public Shape (Shape shape) {
        this.x = shape.getX();
        this.y = shape.getY();
        this.color = shape.getColor();
    }

    public abstract Shape clone();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
