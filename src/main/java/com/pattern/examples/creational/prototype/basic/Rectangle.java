package com.pattern.examples.creational.prototype.basic;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle() {}

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.width = rectangle.getWidth();
        this.height = rectangle.getHeight();
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
