package com.feature8.lamda;
interface  Shape{
    void draw();
}

public class LamdaExampleWithShape {


    public static void main(String[] args) {
        String str="hello";
        Shape rectangle=()-> System.out.println("shape");
        rectangle.draw();



    }
}
