package com.proretention.scrm.Integration.bridge;

public class GreenCircle implements DrawApi{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Green Circle radius "+radius+" ,x:"+x+" ,y:"+y);

    }
}
