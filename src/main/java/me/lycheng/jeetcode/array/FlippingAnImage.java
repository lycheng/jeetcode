package me.lycheng.jeetcode.array;

/**
 * https://leetcode.com/problems/flipping-an-image/
 */
public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = invert(reverse(A[i]));
        }
        return A;
    }

    public int[] reverse(int[] src) {
        int l = 0;
        int r = src.length - 1;
        for(; l < r; l++, r--) {
            int t = src[l];
            src[l] = src[r];
            src[r] = t;
        }
        return src;
    }

    public int[] invert(int[] src) {
        for (int i = 0; i < src.length; i++) {
            src[i] ^= 1;
        }
        return src;
    }
}
