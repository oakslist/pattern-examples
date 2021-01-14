package com.pattern.examples.creational.prototype.basic;

public class Runner {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setX(2);
        circle.setY(3);
        circle.setRadius(5);
        circle.setColor("green");

        Shape circleSame = circle;
        Shape circleClone = circle.clone();

        System.out.println("Circle:");
        System.out.println(circle);
        System.out.println(circleSame);
        System.out.println(circleClone);


    }

}
