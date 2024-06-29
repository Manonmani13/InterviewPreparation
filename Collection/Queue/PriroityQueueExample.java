package com.proretention.scrm.calendar;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriroityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> ts=new PriorityQueue<>();
        ts.add("Pandukumar");

        ts.add("Manonmani");
        ts.add("Maha");
        System.out.println(ts);
        System.out.println(ts.remove());
        System.out.println(ts.peek());
        System.out.println(ts.poll());
    }
}
