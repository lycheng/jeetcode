package me.lycheng.jeetcode.stack;

import java.util.Stack;

/**
 * https://leetcode.com/problems/baseball-game/
 */
public class BaseballGame {

    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for(String op: ops) {
            if (op.equals("C")) {
                if (!stack.isEmpty())
                    stack.pop();
            } else if (op.equals("D")) {
                if (!stack.isEmpty()) {
                    Integer i = stack.peek() * 2;
                    stack.push(i);
                }
            } else if (op.equals("+")) {
                if (stack.size() >= 2) {
                    Integer j = stack.pop();
                    Integer i = stack.pop();
                    stack.push(i);
                    stack.push(j);
                    stack.push(i + j);
                }
            } else {
                Integer i = Integer.parseInt(op);
                stack.push(i);
            }
        }

        int res = 0;
        for(Integer i: stack) {
            res += i;
        }
        return res;
    }
}
