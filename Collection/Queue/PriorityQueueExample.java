package com.practices.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.add("Manonmani");
        pq.add("Pandukumar");
        pq.add("Naveen");
        System.out.println(pq.element());
        System.out.println( pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
