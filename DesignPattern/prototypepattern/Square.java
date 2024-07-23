package com.proretention.scrm.Integration.prototypepattern;

public class Square extends Shape {

    public Square(){
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}