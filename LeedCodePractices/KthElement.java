package com.leetcode;

import java.util.PriorityQueue;

public class KthElement {
	int k;
	PriorityQueue<Integer> minHeap;
	public KthElement(int k, int[] num) {
		minHeap=new PriorityQueue<Integer>();
		this.k=k;
		for(int nu:num)
		{
			add(nu);
		}
	}

	private int add(int nu) {
		minHeap.add(nu);
		if(minHeap.size()>k)
		{
			minHeap.poll();
		}
		return minHeap.peek();
		
	}

	public static void main(String[] args) {
		KthElement kthLargest = new KthElement(3, new int[]{4, 5, 8, 2});
	    System.out.println(kthLargest.add(3));
	}

}
