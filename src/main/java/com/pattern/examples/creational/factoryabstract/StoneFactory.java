package com.pattern.examples.creational.factoryabstract;

public class StoneFactory implements FactoryAbstract {
    @Override
    public Product1 createProduct1() {
        return new StoneProduct1();
    }

    @Override
    public Product2 createProduct2() {
        return new StoneProduct2();
    }
}
