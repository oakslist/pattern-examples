package com.pattern.examples.creational.factorymethod;

public class BoatClient extends ClientAbstract {

    @Override
    Transport createTransport() {
        return new Boat();
    }

}
