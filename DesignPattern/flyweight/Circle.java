package com.practices.flyweight;

public class Circle implements Shape{
   private int x;
    private  int y;
    private int radius;
    private String color;
    public Circle(String color)
    {
        this.color=color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle draw "+" Color : "+color +" x: "+x+" y: "+y+" radius : "+radius);
    }
}
