package com.pattern.examples.structural.composite;

public class Runner {

    public static void main(String[] args) {
        CompositeGraphic compositeGraphic = new CompositeGraphic();
        compositeGraphic.addChild(new Dot(1, 1));
        compositeGraphic.addChild(new Dot(1, 2));

        CompositeGraphic inner = new CompositeGraphic();
        inner.addChild(new Dot(2, 3));
        inner.addChild(new Circle(5, 5, 5));

        compositeGraphic.addChild(inner);

        compositeGraphic.draw();
        compositeGraphic.move(10, 10);
        compositeGraphic.draw();

    }
}
