package com.Thread;

public class ThreadSleepExample2 {
    public static void main(String[] args) {
        try{
            for(int i=0;i<5;i++)
            {
                Thread.sleep(1000);
                System.out.println(i);
            }
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
