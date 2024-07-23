package com.proretention.scrm.Integration.factoryDesignPattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape circle=shapeFactory.getShape("circle");
        circle.draw();
        Shape rectangle=shapeFactory.getShape("rectangle");
        rectangle.draw();
        Shape square=shapeFactory.getShape("square");
        square.draw();
        String test="manonmani";
        System.out.println(test.concat(" pandukumar"));
    }
}
