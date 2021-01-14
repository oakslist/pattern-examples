package com.pattern.examples.creational.builder.item;

public class Car {

    private String name;
    private int seats;
    private int age;

    public Car() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", seats=" + seats +
                ", age=" + age +
                '}';
    }
}
