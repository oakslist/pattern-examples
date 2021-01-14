package com.pattern.examples.creational.factoryabstract;

public class Runner {

    public static void main(String[] args) {
        Client client = new Client(new WoodenFactory());
        client.showProducts();

        client = new Client(new StoneFactory());
        client.showProducts();
    }

}
