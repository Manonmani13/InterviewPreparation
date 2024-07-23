package com.proretention.scrm.Integration.prototypepattern;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println(clonedShape.getType());
        clonedShape.draw();
    }
}
