package com.pattern.examples.creational.builder2static;

public class Car {

    private String name;
    private int seats;
    private int age;

    private Car() {
    }

    public String getName() {
        return name;
    }

    public int getSeats() {
        return seats;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", seats=" + seats +
                ", age=" + age +
                '}';
    }

    public static class Builder {
        private final Car car = new Car();

        private Builder() {
        }

        public static Car.Builder newBuilder() {
            return new Car.Builder();
        }

        public Car.Builder withName(String name) {
            this.car.name = name;
            return this;
        }

        public Car.Builder withSeats(int seats) {
            this.car.seats = seats;
            return this;
        }

        public Car.Builder withAge(int age) {
            this.car.age = age;
            return this;
        }

        public Car build() {
            return this.car;
        }

    }
}
