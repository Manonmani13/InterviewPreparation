package com.practices.facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker maker=new ShapeMaker();
        maker.drawRectangle();
        maker.drawSquare();
    }
}
