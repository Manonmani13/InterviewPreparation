package com.proretention.scrm.Integration.buildPattern;

public class Coke extends  ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 70.0f;
    }
}
