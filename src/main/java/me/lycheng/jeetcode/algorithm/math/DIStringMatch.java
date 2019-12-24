package me.lycheng.jeetcode.algorithm.math;

public class DIStringMatch {
    public int[] diStringMatch(String S) {
        if (S.length() == 0) {
            return null;
        }

        int[] src = new int[S.length() + 1];
        int[] res = new int[S.length() + 1];

        for (int i = 0; i < S.length()+1; i++) {
            src[i] = i;
        }

        int i = 0;
        int l = 0;
        int r = S.length();
        char[] chars = S.toCharArray();
        for(char c: chars) {
            if (c == 'I') {
                res[i++] = src[l++];
            } else {
                res[i++] = src[r--];
            }
        }
        res[i] = src[l];
        return res;
    }
}
