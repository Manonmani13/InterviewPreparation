package com.practices.techinicalQuestion;

public class MissingNumber {
    public static void main(String[] args) {
        int nums[]={3,0,1,4,2};
        System.out.println(missingNo(nums));
    }
    public  static int missingNo(int nums[])
    {
        int n=nums.length;
        int expected=n*(n+1)/2;
        int actual=0;
        for(int nu:nums)
        {
            actual+=nu;
        }
        return expected-actual;
    }

}
