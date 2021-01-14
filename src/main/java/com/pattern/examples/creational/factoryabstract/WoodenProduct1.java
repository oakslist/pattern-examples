package com.pattern.examples.creational.factoryabstract;

public class WoodenProduct1 implements Product1 {
    @Override
    public void whatIsIt() {
        System.out.println("Product1 - wooden");
    }
}
