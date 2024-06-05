package com.practices.java8;

import java.util.ArrayList;
import java.util.Optional;

public class ReduceStream {
public static void main(String[] args) {
	ArrayList<Integer> ls=new ArrayList<>();
	ls.add(10);
	ls.add(20);
	ls.add(30);
	ls.add(40);
	Optional<Integer> oi=ls.stream().reduce((n1,n2)->n1+n2);
	System.out.println(oi);
	Object[] ob=ls.stream().toArray();
	Optional<Integer> o=ls.stream().max((ele1,el2)->ele1.compareTo(el2));
	System.out.println(ob);
}
}
