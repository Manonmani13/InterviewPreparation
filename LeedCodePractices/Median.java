package com.practices.leedconde;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Median {
    public static void main(String[] args) {
        int nums1[]={1,3},nums2[]={2};
        System.out.println("Median: " + findMedianSortedArray(nums1, nums2)); // Output: 2.0

    }
    private static double findMedianSortedArray(int[] nums1,int[] nums2)
    {
        int n=nums1.length;
        int m=nums2.length;
        IntStream mergedStream = IntStream.concat(IntStream.of(nums1), IntStream.of(nums2));

        // Sort the merged stream
        IntStream sortedStream = mergedStream.sorted();

        int length=m+n;
        if(length%2==0)
        {
            int midIndex1=length/2-1;
            return (sortedStream.skip(midIndex1).limit(2).sum()) / 2.0;
        }
        else {
            // Odd number of elements, median is the middle element
            int midIndex = length / 2;
            return sortedStream.skip(midIndex).findFirst().orElse(0);
        }

    }
}

