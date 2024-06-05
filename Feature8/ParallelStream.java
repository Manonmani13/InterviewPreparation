package com.practices.java8;

import java.util.ArrayList;

public class ParallelStream {
public static void main(String[] args) {
	ArrayList<Integer> ls=new ArrayList<>();
	ls.add(10);
	ls.add(20);
	ls.add(30);
	ls.add(40);
	//multhred with order 
	ls.parallelStream().forEachOrdered(System.out::println);
	ls.stream().parallel().forEachOrdered(System.out::println);
}
}
