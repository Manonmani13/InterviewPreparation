package com.proretention.scrm.calendar;

public class GCcollector     {
    public static void main(String[] args) throws Exception {
        Runtime r=Runtime.getRuntime();
        System.out.println(r.totalMemory() +" "+r.freeMemory());
    }
}
