package com.pattern.examples.creational.prototype.registry;

public class Runner {

    public static void main(String[] args) {
        Item item = new Button(1, 2, "green");
        Item item2 = new Button(4, 52, "red");

        ItemRegistry itemRegistry = new ItemRegistry();
        itemRegistry.addItem(item);
        itemRegistry.addItem(item2);

        System.out.println("Button:");
        System.out.println(item);
        System.out.println(itemRegistry.getByIndex(0));

        System.out.println("Button2:");
        System.out.println(item2);
        System.out.println(itemRegistry.getByColor("red"));
    }
}
