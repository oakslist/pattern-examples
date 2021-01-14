package com.pattern.examples.structural.composite;

public class Circle extends Dot {
    private final int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public void draw() {
        System.out.println(String.format("drawing Circle at %s:%s and radius = %s", getX(), getY(), this.radius));
    }
}
