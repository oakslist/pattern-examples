package com.pattern.examples.creational.factoryabstract;

public class StoneProduct1 implements Product1 {
    @Override
    public void whatIsIt() {
        System.out.println("Product1 - stone");
    }
}
