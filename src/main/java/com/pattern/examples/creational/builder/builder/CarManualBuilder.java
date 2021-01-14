package com.pattern.examples.creational.builder.builder;

import com.pattern.examples.creational.builder.item.CarManual;

public class CarManualBuilder implements Builder {
    private CarManual manual;

    @Override
    public void reset() {
        this.manual = new CarManual();
    }

    @Override
    public void setName(String name) {
        this.manual.setName(name);
    }

    @Override
    public void setSeats(int number) {
        this.manual.setSeats(number);
    }

    @Override
    public void setAge(int age) {
        this.manual.setAge(age);
    }

    public CarManual getResults() {
        return this.manual;
    }
}
