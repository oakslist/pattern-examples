package com.pattern.examples.structural.adapter;

public class SquarePegAdapter {
    private final SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    public boolean isFit(RoundHole roundHole) {
        return roundHole.getRadius() >= squarePeg.getWidth() * Math.sqrt(2) / 2;
    }

}
