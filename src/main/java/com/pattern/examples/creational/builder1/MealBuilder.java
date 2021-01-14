package com.pattern.examples.creational.builder1;

import com.pattern.examples.creational.builder1.item.ChickenBurger;
import com.pattern.examples.creational.builder1.item.Coke;
import com.pattern.examples.creational.builder1.item.Pepsi;
import com.pattern.examples.creational.builder1.item.VegBurger;

public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
