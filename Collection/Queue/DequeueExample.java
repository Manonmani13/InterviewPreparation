package com.practices.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExample {
    public static void main(String[] args) {
        Deque<String> dq=new ArrayDeque();
        dq.add("Manonmani");
        dq.add("Naveen");
        dq.add("Pandukumar");
        dq.addFirst("Maha");
        System.out.println(dq);
        dq.pollFirst();
        System.out.println(dq);
    }
}
