package me.lycheng.jeetcode.algorithm.math;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/letter-case-permutation/
 */
public class LetterCasePermutation {

    public List<String> letterCasePermutation(String S) {
        List<String> rv = new LinkedList<>();
        dfs(S.toCharArray(), 0, rv);
        return rv;
    }

    private void dfs(char[] chars, int i, List<String> rv) {
        if (i == chars.length) {
            rv.add(new String(chars));
            return;
        }

        dfs(chars, i + 1, rv);
        if (!Character.isLetter(chars[i]))
            return;

        chars[i] ^= 32;
        dfs(chars, i + 1, rv);
        chars[i] ^= 32;
    }
}
