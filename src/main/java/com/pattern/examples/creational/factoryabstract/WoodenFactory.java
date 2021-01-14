package com.pattern.examples.creational.factoryabstract;

public class WoodenFactory implements FactoryAbstract {
    @Override
    public Product1 createProduct1() {
        return new WoodenProduct1();
    }

    @Override
    public Product2 createProduct2() {
        return new WoodenProduct2();
    }
}
