package me.lycheng.jeetcode.stack;

import java.util.Stack;

/**
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 */
public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<Character>();
        for (char ch : S.toCharArray()) {
            if (stack.isEmpty() || !stack.peek().equals(ch)) {
                stack.push(ch);
                continue;
            }
            stack.pop();
        }
        StringBuilder sb = new StringBuilder();
        for (char ch: stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
