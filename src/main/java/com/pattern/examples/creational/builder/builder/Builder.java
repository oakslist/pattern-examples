package com.pattern.examples.creational.builder.builder;

public interface Builder {
    void reset();
    void setName(String name);
    void setSeats(int number);
    void setAge(int age);
}
