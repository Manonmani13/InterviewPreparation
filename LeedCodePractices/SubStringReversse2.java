package com.practices.leedconde;

import java.util.Arrays;
import java.util.Stack;

public class SubStringReversse {
    public static void main(String[] args) {
        String s1 = "(abcd)";
        String s2 = "(u(love)i)";
        String s3 = "(ed(et(oc))el)";

        System.out.println(reverseParentheses(s1)); // Output: dcba
        System.out.println(reverseParentheses(s2)); // Output: iloveu
        System.out.println(reverseParentheses(s3));

    }
    public static String reverseParentheses(String s) {
        char[] chars=s.toCharArray();
        int n=chars.length;
        Stack<Integer> stack=new Stack<>();
        int[] pair=new int[n];
        for (int i = 0; i < n; i++) {
            if (chars[i] == '(') {
                stack.push(i);
            } else if (chars[i] == ')') {
                int j = stack.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0, dir = 1; i < n; i += dir) {
            if (chars[i] == '(' || chars[i] == ')') {
                i = pair[i];
                dir = -dir;
            } else {
                sb.append(chars[i]);
            }
        }

        return sb.toString();

    }




}
