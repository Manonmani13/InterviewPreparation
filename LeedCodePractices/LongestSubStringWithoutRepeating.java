package com.practices;

import java.util.*;
import java.util.stream.Collectors;

public class LongestSubStringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }

        // Map to store characters and their last seen index
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            // If the current character is already in the map and its index is >= start,
            // move the start pointer to the right of the last occurrence of currentChar
            if (map.containsKey(currentChar)) {
                start = Math.max(map.get(currentChar) + 1, start);
            }
            // Update the last seen index of the current character
            map.put(currentChar, end);
            // Calculate the maximum length of substring without repeating characters
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        System.out.println("Length of longest substring in \"" + s1 + "\" is: " + lengthOfLongestSubstring(s1));
    }
}
