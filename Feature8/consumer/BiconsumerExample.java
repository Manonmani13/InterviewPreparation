package com.consumer;

import java.util.function.BiConsumer;

public class BiconsumerExample {
public static void main(String[] args) {
	BiConsumer<Integer, Integer> bc1=(x,y)->System.out.println(x+y);
	BiConsumer<Integer, Integer> bc2=(x,y)->System.out.println(x-y);
	bc1.accept(20, 40);
	bc2.accept(20, 40);

	bc1.andThen(bc2);
}
}
