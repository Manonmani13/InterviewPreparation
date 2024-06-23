package com.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<>();
        queue.add("Manonmani");
        queue.add("Naveen");
        queue.add("Pandukumar");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
    }
}
