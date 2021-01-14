package com.pattern.examples.creational.builder.builder;

import com.pattern.examples.creational.builder.item.Car;

public class CarBuilder implements Builder {
    private Car car;

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setName(String name) {
        this.car.setName(name);
    }

    @Override
    public void setSeats(int number) {
        this.car.setSeats(number);
    }

    @Override
    public void setAge(int age) {
        this.car.setAge(age);
    }

    public Car getResults() {
        return this.car;
    }
}
