package me.lycheng.jeetcode.algorithm.array

class SumOfEvenNumbersAfterQueriesTest extends GroovyTestCase {
    void testSumEvenAfterQueries() {
        SumOfEvenNumbersAfterQueries solution = new SumOfEvenNumbersAfterQueries()

        int[] A = [1, 2, 3, 4]
        int[][] queries = [[1, 0], [-3, 1], [-4, 0], [2, 3]]
        int[] dst = [8, 6, 2, 4]

        assert dst.equals(solution.sumEvenAfterQueries(A, queries))
    }

    void testSumOfEvenValues() {
        SumOfEvenNumbersAfterQueries solution = new SumOfEvenNumbersAfterQueries()

        int[] src = [2, 2, 3, 4]
        int dst = 8
        assertEquals(dst, solution.sumOfEvenValues(src))

        src = [-2, -1, 3, 6]
        dst = 4
        assertEquals(dst, solution.sumOfEvenValues(src))

    }
}
