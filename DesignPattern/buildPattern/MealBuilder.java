package com.proretention.scrm.Integration.buildPattern;

public class MealBuilder {
    public Meal prepareVeg()
    {
        Meal meal=new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
    public Meal prepareNonVeg()
    {
        Meal meal=new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepso());
        return meal;
    }
}
