package com.proretention.scrm.Integration.abstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean round)
    {
        if(round)
            return new RoundedShapeFactory();
        else
            return new ShapeFactory();
    }

}
