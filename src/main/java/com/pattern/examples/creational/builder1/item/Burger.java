package com.pattern.examples.creational.builder1.item;

import com.pattern.examples.creational.builder1.packing.Packing;
import com.pattern.examples.creational.builder1.packing.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

}
