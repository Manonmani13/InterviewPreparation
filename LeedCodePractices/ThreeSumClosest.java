package com.leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
	public static void main(String[] args) {
		 int[] nums1 = {-1, 2, 1, -4};
	        int target1 = 1;
	        System.out.println(threeSumClosest(nums1, target1)); // Output: 2

	}
	public static int threeSumClosest(int []nums,int target)
	{
		Arrays.sort(nums);
		int n=nums.length;
		int closest=nums[0]+nums[1]+nums[2];
		for(int i=0;i<n-2;i++)
		{
			int left=i+1;
			int right=n-1;
			while(left<right)
			{
				int currentSum=nums[i]+nums[left]+nums[right];
				if(Math.abs(currentSum-target)<Math.abs(closest-target))
				{
					closest=currentSum;
				}
				if(currentSum<target)
				{
					left++;
				}
				else if(currentSum>target)
				{
					right--;
				}
				else
				{
					return currentSum;
				}
			}
		}
		return closest;
	}
}
