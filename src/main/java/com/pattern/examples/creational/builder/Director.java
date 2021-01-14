package com.pattern.examples.creational.builder;

import com.pattern.examples.creational.builder.builder.Builder;

public class Director {

    public void makeSportCar(Builder builder) {
        builder.reset();
        builder.setName("Sport Car");
        builder.setSeats(1);
        builder.setAge(2020);
    }

    public void make4SeatsCar(Builder builder) {
        builder.reset();
        builder.setName("4 Seats Car");
        builder.setSeats(4);
        builder.setAge(2020);
    }

    public void make2SeatsCar(Builder builder) {
        builder.reset();
        builder.setName("2 Seats Car");
        builder.setSeats(2);
        builder.setAge(2020);
    }

}
