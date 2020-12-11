package com.edu.interview;

import java.util.Stack;

public class BalancedParentheses {
    public static String checkBalancedParentheses(String expr) {
        if (expr.isEmpty())
            return "Balanced";
        if (expr.length() % 2 != 0) {
            return "Not Balanced";
        }

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < expr.length(); i++) {
            char current = expr.charAt(i);
            if (current == '{' || current == '(' || current == '[') {
                stack.push(current);
            }
            if (current == '}' || current == ')' || current == ']') {
                if (stack.isEmpty())
                    return "Not Balanced";
                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return "Not Balanced";
            }
        }
        return stack.isEmpty() ? "Balanced" : "Not Balanced";
    }

    public static void main(String[] args) {
        System.out.println(checkBalancedParentheses("((()())"));
    }
}
