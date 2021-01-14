package com.pattern.examples.creational.factorymethod;

public class CarClient extends ClientAbstract {

    @Override
    Transport createTransport() {
        return new Car();
    }

}
