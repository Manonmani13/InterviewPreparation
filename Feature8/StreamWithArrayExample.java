package com.practices.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class StreamWithArrayExample {
public static void main(String[] args) {
	int s[]= {2,7,6,5,3,4,1};
	Arrays.stream(s).sorted().forEach(System.out::println);
	System.out.println(Arrays.stream(s).average());
	System.out.println(Arrays.stream(s).count());

	List<Integer> l=new ArrayList<>();
	l.add(20);
	l.add(10);
	l.add(4);
	l.add(5);
	l.stream().sorted().forEach(System.out::println);
	OptionalInt oi=Arrays.stream(s).max();
	System.out.println(oi);
	OptionalInt i=Arrays.stream(s).min();
	System.out.println(i);
	System.out.println("find first"+ Arrays.stream(s).findFirst());
	System.out.println(Arrays.stream(s).findAny());
	System.out.println(Arrays.stream(s));
}
}
