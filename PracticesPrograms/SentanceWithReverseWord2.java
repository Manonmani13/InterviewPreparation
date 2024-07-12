package com.practices.javapractices;

public class SentanceWithReverseWord {
    public static void main(String[] args) {
        String s = "Manonmani Pandukumar";
        String reversed = reverseWords(s);
        System.out.println(reversed);
    }

    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = 0;
        int n = chars.length;

        while (end < n) {
            // Move end to the end of the current word
            while (end < n && chars[end] != ' ') {
                end++;
            }

            // Reverse the current word
            reverseWord(chars, start, end - 1);

            // Move start to the beginning of the next word
            start = end + 1;
            end = start;
        }

        return new String(chars);
    }

    private static void reverseWord(char[] chars, int left, int right) {
        while (left < right) {
            // Swap characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            // Move towards the center
            left++;
            right--;
        }
    }
}
