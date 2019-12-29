package me.lycheng.jeetcode.algorithm.array;

/**
 * https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 */
public class ReplaceElementsWithGreatestElementOnRightSide {

    public int[] replaceElements(int[] arr) {
        if (arr.length == 1)
            return new int[] {-1};

        int len = arr.length;
        int[] rv = new int[len];
        rv[len - 1] = -1;

        for (int i = len - 2; i >= 0; i--) {
            int j = Math.max(arr[i + 1], rv[i + 1]);
            rv[i] = j;
        }
        return rv;
    }
}
