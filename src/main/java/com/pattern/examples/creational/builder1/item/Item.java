package com.pattern.examples.creational.builder1.item;

import com.pattern.examples.creational.builder1.packing.Packing;

public interface Item {
    String name();
    Packing packing();
    float price();
}
