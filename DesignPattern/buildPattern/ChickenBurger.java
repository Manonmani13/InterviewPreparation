package com.proretention.scrm.Integration.buildPattern;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 250.0f;
    }
}
