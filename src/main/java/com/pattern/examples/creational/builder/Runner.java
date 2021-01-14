package com.pattern.examples.creational.builder;

import com.pattern.examples.creational.builder.builder.CarBuilder;
import com.pattern.examples.creational.builder.builder.CarManualBuilder;
import com.pattern.examples.creational.builder.item.Car;
import com.pattern.examples.creational.builder.item.CarManual;

public class Runner {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.makeSportCar(carBuilder);

        Car car = carBuilder.getResults();
        System.out.println(car);

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.make4SeatsCar(carManualBuilder);

        CarManual carManual = carManualBuilder.getResults();
        System.out.println(carManual);
    }

}
