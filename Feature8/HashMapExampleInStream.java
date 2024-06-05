package com.practices.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapExampleInStream {
public static void main(String[] args) {
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	hm.put("C Manon", 20);
	hm.put("B Pandu", 10);
	hm.put("A Maha", 30);
	hm.keySet().stream().sorted().forEach(System.out::println);
	hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	hm.keySet().stream().sorted().collect(Collectors.toSet()).forEach(System.out::println);
	hm.keySet().stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
	Boolean b=hm.keySet().stream().anyMatch(name->name.endsWith("u"));
System.out.println(b);
}
}
