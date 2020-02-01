package me.lycheng.jeetcode.algorithm.string;

/**
 * https://leetcode.com/problems/compare-strings-by-frequency-of-the-smallest-character/
 */
public class CompareStringsByFrequencyOfTheSmallestCharacter {

    private int f(String s) {
        int minCharCnt = Integer.MIN_VALUE;
        char minChar = 'z' + 1;
        for (char c : s.toCharArray()) {
            if (c > minChar)
                continue;

            if (c < minChar) {
                minChar = c;
                minCharCnt = 1;
                continue;
            }
            minCharCnt += 1;
        }
        return minCharCnt;
    }

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] rv = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];
            for (String word : words) {
                if (f(query) < f(word))
                    rv[i] += 1;
            }
        }
        return rv;
    }
}
