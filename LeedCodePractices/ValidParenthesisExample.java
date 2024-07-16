package com.practices.leedconde;

import java.util.Stack;

public class ValidParenthesisExample {
    public static boolean isValid(String s) {
        // Use a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                // Push onto the stack if it's an opening bracket
                stack.push(c);
            } else {
                // If it's a closing bracket, check if stack is empty or matches
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false; // Mismatched brackets
                }
            }
        }

        // Stack should be empty at the end if all brackets are matched correctly
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";

        System.out.println("Example 1: " + isValid(s1)); // Output: true
        System.out.println("Example 2: " + isValid(s2)); // Output: true
        System.out.println("Example 3: " + isValid(s3)); // Output: false
    }
}
