package com.practices.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorWithLamda {
public static void main(String[] args) {
	ArrayList<Integer> ls=new ArrayList<>();
	ls.add(100);
	ls.add(10);
	ls.add(30);
	ls.add(2);
	System.out.println(ls);
	Comparator<Integer> c=(o,o2)->(o<o2)?-1:(o>02)?1:0;
	Collections.sort(ls,c);
	System.out.println(ls);
	ls.forEach(System.out::println);
	List<Integer> l2=ls.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(l2);
	
}
}
