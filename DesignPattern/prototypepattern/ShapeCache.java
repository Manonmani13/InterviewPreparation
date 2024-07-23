package com.proretention.scrm.Integration.prototypepattern;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String,Shape> shape=new Hashtable<>();

    public static Shape getShape(String shapeId)
    {
        Shape caheShpe=shape.get(shapeId);
        return (Shape) caheShpe.clone();
    }

    public static void  loadCache()
    {
        Square s=new Square();
        s.setId("1");
        s.setType("Square");
        shape.put(s.getId(),s);
        Rectangle r=new Rectangle();
        r.setId("2");
        r.setType("rectangle");
        shape.put(r.getId(),r);
    }

}
