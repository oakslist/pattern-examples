package com.pattern.examples.creational.prototype.basic;

public class Circle extends Shape {
    private int radius;

    public Circle() {}

    public Circle(Circle circle) {
        super(circle);
        this.radius = circle.getRadius();
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
