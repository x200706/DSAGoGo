package org.example;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class StackDS {
    @Test
    public void isValidTest() {
        System.out.println(isValid("[{}()]"));
    }

    public boolean isValid(String s) {
        Stack<Character> checkStack = new Stack<>();
        //字串轉陣列
        char[] targetArray = s.toCharArray();
        for (char c : targetArray) {
            if (c == '(') {
                checkStack.push(')');
            } else if (c == '{') {
                checkStack.push('}');
            } else if (c == '[') {
                checkStack.push(']');
            } else if (checkStack.isEmpty() || c != checkStack.pop()) {
                return false;
            }
        }
        return checkStack.isEmpty();
    }
}
