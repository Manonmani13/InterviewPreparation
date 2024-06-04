package com.practices.java8;

import java.util.ArrayList;

public class MapDemo {
public static void main(String[] args) {
	ArrayList<Integer> l=new ArrayList<>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.stream().map(n->n/2).forEach(System.out::println);
}
}
