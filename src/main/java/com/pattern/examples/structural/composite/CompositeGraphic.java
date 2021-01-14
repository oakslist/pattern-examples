package com.pattern.examples.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {
    private final List<Graphic> graphicList = new ArrayList<>();

    public void addChild(Graphic childGraphic) {
        this.graphicList.add(childGraphic);
    }

    public void removeChild(Graphic childGraphic) {
        this.graphicList.remove(childGraphic);
    }

    @Override
    public void move(int x, int y) {
        for (Graphic g : graphicList) {
            g.move(x, y);
        }
    }

    @Override
    public void draw() {
        for (Graphic g : graphicList) {
            g.draw();
        }
    }
}
