package com.pattern.examples.creational.factorymethod;

public class Car implements Transport {
    @Override
    public void makeSound() {
        System.out.println("bip");
    }
}
