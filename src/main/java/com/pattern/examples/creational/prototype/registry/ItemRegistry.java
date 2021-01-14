package com.pattern.examples.creational.prototype.registry;

import java.util.ArrayList;
import java.util.List;

public class ItemRegistry {

    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        this.items.add(item);
    }

    public Item getByIndex(int index) {
        return items.get(index).clone();
    }

    public Item getByColor(String color) {
        for (Item item : items) {
            if (color.equals(item.getColor())) {
                return item.clone();
            }
        }
        return items.get(0).clone();
    }

}
