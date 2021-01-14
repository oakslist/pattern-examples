package com.pattern.examples.creational.builder2static;

public class Runner {

    public static void main(String[] args) {
        Car car = Car.Builder.newBuilder()
                .withName("new car")
                .withSeats(4)
                .withAge(2020)
                .build();
        System.out.println(car);


        Computer computer = new Computer.Builder("128 GB", "4 GB")
                .withProcessor("Intel")
                .setGaphicsCardEnabled(true)
                .setBluetoothEnabled(false)
                .build();
        System.out.println(computer);
    }

}
