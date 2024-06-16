package com.collection.Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> ls=new LinkedList<>();
        ls.add(3);
        ls.add(10);
        ls.add(12);
        ls.add(1);
        ls.add(8);
        System.out.println("Head is "+ls.peek());
        //if you there is nothing in queue remove method will throw exception
        System.out.println("Head is "+ls.remove());
        System.out.println("Head is "+ls.peek());
        //if there is nothing in queue it will return null insisted of throwing error it is also like remove method

        System.out.println("Head is "+ls.poll());
        Queue<Integer> l=new PriorityQueue<>();
        l.add(3);
        l.add(10);
        l.add(12);
        l.add(1);
        l.add(8);
        //priority queue sorted and save
        System.out.println("Head is "+l.peek());



    }
}
