package com.proretention.scrm.Integration.abstractFactory;
import com.proretention.scrm.Integration.abstractFactory.*;
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return (Shape) new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return (Shape) new Square();
        }
        return null;
    }
}
