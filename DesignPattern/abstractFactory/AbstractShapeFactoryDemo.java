package com.proretention.scrm.Integration.abstractFactory;

public class AbstractShapeFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory round=FactoryProducer.getFactory(true);
        Shape shape1 =  round.getShape("RECTANGLE");
        shape1.draw();
        AbstractFactory shape=FactoryProducer.getFactory(false);
        Shape shape2 = shape.getShape("square");
        shape2.draw();

    }
}
