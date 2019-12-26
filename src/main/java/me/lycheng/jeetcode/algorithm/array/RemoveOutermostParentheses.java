package me.lycheng.jeetcode.algorithm.array;

/**
 * https://leetcode.com/problems/remove-outermost-parentheses/
 */
public class RemoveOutermostParentheses {

    public String removeOuterParentheses(String S) {
        StringBuilder builder = new StringBuilder();
        int cnt = 0;
        for(char c: S.toCharArray()) {
            if (c == '(' && cnt++ > 0)
                builder.append(c);

            if (c == ')' && cnt-- > 1)
                builder.append(c);
        }
        return builder.toString();
    }
}
