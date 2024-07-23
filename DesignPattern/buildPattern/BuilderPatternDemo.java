package com.proretention.scrm.Integration.buildPattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mb=new MealBuilder();
        Meal vegMeal=mb.prepareVeg();
        vegMeal.showItems();
        System.out.println(vegMeal.getCost());
    }
}
