package me.lycheng.jeetcode.array;

import java.util.ArrayList;
import java.util.List;

public class SquaresOfASortedArray {

    // common solution
    public int[] sortedSquares_0(int[] A) {
        if (A.length == 0) {
            return A;
        }

        // use LinkedList TLE
        List<Integer> sortedA = new ArrayList<>();
        sortedA.add(A[0] * A[0]);

        for (int i = 1; i < A.length; i++) {
            int j = 0;
            int squareNum = A[i] * A[i];
            for (; j < sortedA.size(); j++) {
                if (squareNum < sortedA.get(j)) {
                    break;
                }
            }
            sortedA.add(j, squareNum);
        }
        return sortedA.stream().mapToInt(i->i).toArray();
    }

    public int[] sortedSquares(int[] A) {
        int len = A.length;
        int[] res = new int[len];
        int left = 0, right = len - 1;

        for (int i = len - 1; i >= 0; i--) {

            if (Math.abs(A[left]) > Math.abs(A[right])) {
                res[i] = A[left] * A[left];
                left++;
            } else {
                res[i] = A[right] * A[right];
                right--;
            }
        }
        return res;
    }
}
