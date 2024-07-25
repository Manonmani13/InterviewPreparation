package com.proretention.scrm.Integration.command;

public class Stock {

    private String name="TEst";

    private int quanity=10;

    public void buy(){
        System.out.println("Stock [NAme :"+name+" Quantity:  "+quanity+" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quanity +" ] sold");
    }
}
