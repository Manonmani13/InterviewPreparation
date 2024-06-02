package com.practices.java8;

import java.util.function.Function;

public class ApplyMethod {
public static void main(String[] args) {
	Function<Integer, Integer> fu=i->i*i;
	System.out.println(fu.apply(3));
}
}
