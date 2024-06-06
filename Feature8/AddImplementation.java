package com.practices.java8;

public class AddImplementation {
public static void main(String[] args) {
	AddInterface ai=( a, b)->System.out.print("Addition "+(a+b));
	ai.add(20,30);
	ai.add(30, 50);
}
}
