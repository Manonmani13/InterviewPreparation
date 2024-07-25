package com.proretention.scrm.Integration.intercepting;

public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
