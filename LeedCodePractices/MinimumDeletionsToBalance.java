package com.practices.leedconde;
public class MinimumDeletionsToBalance {

    public static int minDeletionsToBalance(String s) {
        int n = s.length();

        // Edge case: Empty string or single character string
        if (n <= 1) {
            return 0;
        }

        int totalA = 0;
        int totalB = 0;

        // Count total number of 'a's and 'b's in the string
        for (char c : s.toCharArray()) {
            if (c == 'a') totalA++;
            if (c == 'b') totalB++;
        }

        // Initialize the minimum deletions to the maximum possible value
        int minDeletions = totalB;

        int currentA = 0;  // Number of 'a's seen so far
        int currentB = 0;  // Number of 'b's seen so far

        // Iterate over the string to find the minimum deletions needed
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                currentA++;
            } else if (c == 'b') {
                currentB++;
            }

            // Calculate deletions needed if stopping here
            int deletions = currentB + (totalA - currentA);
            minDeletions = Math.min(minDeletions, deletions);
        }

        return minDeletions;
    }

    public static void main(String[] args) {
        String s1 = "aababbab";
        System.out.println("Minimum deletions for \"" + s1 + "\" is: " + minDeletionsToBalance(s1));

        String s2 = "bbaaaaabb";
        System.out.println("Minimum deletions for \"" + s2 + "\" is: " + minDeletionsToBalance(s2));

        String s3 = "b";
        System.out.println("Minimum deletions for \"" + s3 + "\" is: " + minDeletionsToBalance(s3));

        String s4 = "a";
        System.out.println("Minimum deletions for \"" + s4 + "\" is: " + minDeletionsToBalance(s4));

        String s5 = "";
        System.out.println("Minimum deletions for \"" + s5 + "\" is: " + minDeletionsToBalance(s5));

        String s6 = "bbbbbbbbbbbbbb";
        System.out.println("Minimum deletions for \"" + s6 + "\" is: " + minDeletionsToBalance(s6));

        String s7 = "bbbbbbbaabbbbbaaabbbabbbbaabbbbbbaabbaaabaabbbaaaabaaababbbabbabbaaaabbbabbbbbaabbababbbaaaaaababaaababaabbabbbaaaabbbbbabbabaaaabbbaba";
        System.out.println("Minimum deletions for \"" + s7 + "\" is: " + minDeletionsToBalance(s7));
    }
}

