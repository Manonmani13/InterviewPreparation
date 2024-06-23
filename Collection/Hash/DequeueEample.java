package com.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueEample {
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<>();
        deque.add("Manonmani");
        deque.add("Naveen");
        deque.add("Pandukumar");
        deque.add("Maha");
        System.out.println(deque);

    }
}
