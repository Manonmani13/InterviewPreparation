package com.test;

public class MaxArea {
	public static void main(String[] args) {
		int left=0;
		int height[]= {1,8,6,2,5,4,8,3,7};
		int right=height.length-1;
		int maxArea=0;
		while(left<right)
		{
			int width=right-left;
			int minHeight=Math.min(height[left],height[right]);
			int currentArea=width*minHeight;
			System.out.println(currentArea);
			maxArea=Math.max(maxArea, currentArea);
			System.out.println(maxArea);
			if(height[left]<height[right])
			{
				left++;
			}
			else
			{
				right--;
			}
			
			
		}
		System.out.println(maxArea);
		
	}

}
