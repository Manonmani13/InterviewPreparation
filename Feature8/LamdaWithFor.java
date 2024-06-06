package com.practices.java8;

import java.util.ArrayList;
import java.util.List;

public class LamdaWithFor {
public static void main(String[] args) {
	List<Integer> ls=new ArrayList<>();
	ls.add(20);
	ls.add(10);ls.add(2);
	ls.add(4);
	ls.forEach(l->System.out.println(l));
	ls.forEach(n->{if(n%2==0) 
	System.out.println(n);
	});
}
}
