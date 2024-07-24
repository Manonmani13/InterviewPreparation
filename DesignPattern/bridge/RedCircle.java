package com.proretention.scrm.Integration.bridge;

public class RedCircle implements DrawApi{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Red Circle radius "+radius+" ,x:"+x+" ,y:"+y);
    }
}
