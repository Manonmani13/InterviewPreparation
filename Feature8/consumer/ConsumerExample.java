package com.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
public static void main(String[] args) {
	Consumer<String> c=(m)->System.out.println(m.concat("mano"));
	c.accept("Hello ");
	Consumer<String> c1=(m)->System.out.println(m.toLowerCase());
	c1.accept("NANI ");
	Consumer<String> c2=(m)->System.out.println(m.toUpperCase());
	c2.accept("hi nani ");
	//if i want to execute two thing in one line
	c.andThen(c2).accept("Hey Nani");
}
}
