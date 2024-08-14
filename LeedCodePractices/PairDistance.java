package com.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PairDistance {
	public static void main(String[] args) {
		int[] nums1 = {1, 6, 1};
        int k1 = 3;
        System.out.println(KthDistance(nums1, k1)); 
        
        
		
	}

	public  static int KthDistance(int nums[],int k)
	{
		Arrays.sort(nums);
		int n=nums.length;
		int left=0;
		int right=nums[n-1]-nums[0];
		while(left<right)
		{
			int mid=left+(right-left)/2;
			if(countPairsLess(nums,mid)<k)
			{
				left=mid+1;
			}
			else
			{
				right=mid;
			}
			
		}
		return left;
	}

	private static int countPairsLess(int[] nums, int mid) {
		// TODO Auto-generated method stub
		int count=0;
		int left=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]-nums[left]>mid)
			{
				left++;
			}
			count+=i-left;
			
		}
		return count;
	}
}
