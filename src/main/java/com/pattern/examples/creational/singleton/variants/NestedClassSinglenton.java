package com.pattern.examples.creational.singleton.variants;

public class NestedClassSinglenton {

    private NestedClassSinglenton() {
    }

    public static NestedClassSinglenton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        public static final NestedClassSinglenton INSTANCE = new NestedClassSinglenton();
    }

}
