package com.practices.flyweight;

public class FlyweightPatternDemo   {
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {
        for(int i=0;i<20;++i)
        {
            Circle cirle= (Circle) ShapeFactory.getCircle(colors[i]);
            cirle.setX(getRandomX());
            cirle.setY(getRandomY());
            cirle.setColor(getRandomColor());
            cirle.draw();
        }

    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
