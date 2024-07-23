package com.proretention.scrm.Integration.abstractFactory;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }else if(shape.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}
