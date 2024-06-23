package com.Thread;

public class ThreadWithCakeExample {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            Cake cake=new Cake();
            cake.start();
        }

    }
}

class Cake extends  Thread{
    public  void run()
    {
        System.out.println("Mixing Integredient for Cake "+ Cake.currentThread().getId());
        System.out.println("BakingCake "+ Cake.currentThread().getId());
        System.out.println("Decorating Cake "+ Cake.currentThread().getId());

    }

}
