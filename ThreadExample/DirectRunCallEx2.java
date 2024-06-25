package com.Thread;

public class DirectRunCallEx2 extends  Thread{
    @Override
    public void run() {
        for(int i=1;i<=5;i++)
        {
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    System.out.println(e);
                }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        DirectRunCallEx2 e =new DirectRunCallEx2();
        e.run();
    }
}
