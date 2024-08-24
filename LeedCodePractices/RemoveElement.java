package com.leetcode;

public class RemoveElement {
	public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int length1 = removeElement(nums1, val1);
        System.out.println(length1);

	}

	private static int removeElement(int[] nums1, int val1) {
		// TODO Auto-generated method stub
		int writeIndex=0;
		for(int readIndex=0;readIndex<nums1.length;readIndex++)
		{
			if(nums1[readIndex]!=val1)
			{
				nums1[writeIndex]=nums1[readIndex];
				System.out.println(nums1[writeIndex]);
				writeIndex++;
			}
		}
		return writeIndex;
	}

}
