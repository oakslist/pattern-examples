package com.pattern.examples.structural.adapter;

public class Runner {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        SquarePegAdapter squarePegAdapter;
        for (int i = 6; i < 10; i++) {
            squarePegAdapter = new SquarePegAdapter(new SquarePeg(i));
            System.out.println("square = " + i + "; isFit: " + squarePegAdapter.isFit(roundHole));
        }
    }

}
