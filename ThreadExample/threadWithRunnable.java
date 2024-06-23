package com.Thread;

public class threadWithRunnable implements  Runnable{

    @Override
    public void run() {
        for(int i=0;i<4;i++){
            Cake cake=new Cake();
            cake.start();
        }

    }
}

