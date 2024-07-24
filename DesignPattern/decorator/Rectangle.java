package com.proretention.scrm.Integration.decorator;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }
}
