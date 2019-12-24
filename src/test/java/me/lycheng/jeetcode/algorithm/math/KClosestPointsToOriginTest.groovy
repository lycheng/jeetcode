package me.lycheng.jeetcode.algorithm.math

class KClosestPointsToOriginTest extends GroovyTestCase {
    void testKClosest() {
        KClosestPointsToOrigin solution = new KClosestPointsToOrigin();

        int[][] points = [[1, 3], [-2, 2]]
        int k = 1
        int[][] expected = [[-2, 2]]
        int[][] res = solution.kClosest(points, k)
        assertMatricsEquals(expected, res)

        points = [[3, 3], [5, -1], [-2, 4]]
        k = 2
        expected = [[-2, 4], [3, 3]]
        res = solution.kClosest(points, k)
        assertMatricsEquals(expected, res)
    }

    void assertMatricsEquals(int[][] m1, int[][] m2) {
        assert m1.length == m2.length
        for (int i = 0; i < m1.length; i++) {
            assert m1[i].equals(m2[i])
        }
    }
}
