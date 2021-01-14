package com.pattern.examples.creational.singleton;

public class Runner {

    public static void main(String[] args) {
        SunSingleton sun = SunSingleton.getInstance();
        System.out.println(sun);
        SunSingleton sun2 = SunSingleton.getInstance();
        System.out.println(sun2);
    }

}
