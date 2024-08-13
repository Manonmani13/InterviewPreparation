package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
	public static void main(String[] args) {
		int nums[]= {-1,0,1,2,-1,4};
		List<List<Integer>> ls=threeSum(nums);
		for (List<Integer> triplet : ls) {
            System.out.println(triplet);
        }
	}

	private static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ls=new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++)
		{
			if(i>0&& nums[i]==nums[i-1])
			{
				continue;
			}
			int left=i+1;
			int right=nums.length-1;
			int target=-nums[i];
			while(left<right)
			{
				int sum=nums[left]+nums[right];
				if(sum==target)
				{
					ls.add(Arrays.asList(nums[i],nums[left],nums[right]));
					while(left<right&& nums[left]==nums[left+1])
					{
						left++;
					}
					while(left<right&& nums[right]==nums[right+1])
					{
						right--;
					}
					left++;
					right--;
				}
				else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
			}
		}
		return ls;

	}

}
