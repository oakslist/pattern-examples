package com.pattern.examples.creational.factoryabstract;

public class Client {
    private FactoryAbstract factoryAbstract;

    public Client(FactoryAbstract factoryAbstract) {
        this.factoryAbstract = factoryAbstract;
    }

    public void showProducts() {
        factoryAbstract.createProduct1().whatIsIt();
        factoryAbstract.createProduct2().whatIsIt();
    }
}
