package com.pattern.examples.creational.builder1.item;

import com.pattern.examples.creational.builder1.packing.Bottle;
import com.pattern.examples.creational.builder1.packing.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
