package com.pattern.examples.creational.factorymethod;

public class Runner {

    public static void main(String[] args) {
        ClientAbstract clientCar = new CarClient();
        Transport car = clientCar.createTransport();
        car.makeSound();

        ClientAbstract clientBoat = new BoatClient();
        Transport boat = clientBoat.createTransport();
        boat.makeSound();
    }

}
