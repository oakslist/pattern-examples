package com.pattern.examples.creational.prototype.registry;

public class Button implements Item {
    private int x;
    private int y;
    private String color;

    public Button(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Button(Button button) {
        this.x = button.getX();
        this.y = button.getY();
        this.color = button.getColor();
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Item clone() {
        return new Button(this);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
