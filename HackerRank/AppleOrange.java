package com.hackerrank;

import java.util.Arrays;
import java.util.List;

public class AppleOrange {
	public static void main(String[] args) {
		int s=2,t=3,a=5,b=6;
		List<Integer> apples=Arrays.asList(4,5,6,7);
		List<Integer> oranges=Arrays.asList(1,2,3,4);
		long appleCount=apples.stream().map(apple->a+apple).filter(post->post<=t).count();
		System.out.println(appleCount);
	}

}
