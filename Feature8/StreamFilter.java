package com.practices.java8;

import java.util.Arrays;

public class StreamFilter {
public static void main(String[] args) {
	int s[]= {2,7,6,5,3,4,1,2,3,4};
	System.out.println(Arrays.stream(s).anyMatch(n->n>10));
}
}
