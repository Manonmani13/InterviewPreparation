package com.practices.java8;

import java.util.HashMap;

public class HashMapExampleInStream {
public static void main(String[] args) {
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	hm.put("C Manon", 20);
	hm.put("B Pandu", 10);
	hm.put("A Maha", 30);
	hm.keySet().stream().sorted().forEach(System.out::println);
}
}
