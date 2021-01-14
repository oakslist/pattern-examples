package com.pattern.examples.creational.singleton;

public class SunSingleton {

    private static SunSingleton instance;

    private SunSingleton() {
    }

    // no thread lock for multithreading here!!!
    public static SunSingleton getInstance() {
        if (SunSingleton.instance == null) {
            SunSingleton.instance = new SunSingleton();
        }
        return SunSingleton.instance;
    }

}
