package me.lycheng.jeetcode.algorithm.array;

/**
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/
 */
public class PeakIndexInAMountainArray {

    public int peakIndexInMountainArray(int[] A) {
        int l = 1;
        int r = A.length - 2;
        int peak = 0;

        int prevLeft = A[0];
        int prevRight = A[A.length - 1];
        for (;l <= r; l++, r--) {
            if (A[l] < prevLeft || A[r] < prevRight) {
                break;
            }

            if (A[l] > A[peak])
                peak = l;

            if (A[r] > A[peak])
                peak = r;

            prevLeft = A[l];
            prevRight = A[r];
        }
        return peak;
    }

    public int binarySearch(int[] A) {
        int l = 0, r = A.length - 1, mid;
        while (l < r) {
            mid = (l + r) / 2;
            if (A[mid] < A[mid + 1]) l = mid;
            else if (A[mid - 1] > A[mid]) r = mid;
            else return mid;
        }
        return 0;
    }
}
