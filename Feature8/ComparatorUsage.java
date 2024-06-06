package com.practices.java8;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorUsage {
public static void main(String[] args) {
	ArrayList<Integer> ls=new ArrayList<>();
	ls.add(10);
	ls.add(100);
	ls.add(20);
	ls.add(5);
	System.out.println(ls);
	Collections.sort(ls, new MyComparator());
	System.out.println(ls);
}
}
