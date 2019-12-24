package me.lycheng.jeetcode.algorithm.array

class FlippingAnImageTest extends GroovyTestCase {
    void testFlipAndInvertImage() {
        int[][] src = [[1, 1, 0], [1, 0, 1], [0, 0, 0]]
        int[][] dst = [[1, 0, 0], [0, 1, 0], [1, 1, 1]]

        FlippingAnImage solution = new FlippingAnImage()
        int[][] rv = solution.flipAndInvertImage(src)
        for (int i = 0; i < dst.length; i++) {
            assert dst[i].equals(rv[i])
        }
    }

    void testReverse() {
        int[] src = [1, 0, 0]
        int[] dst = [0, 0, 1]
        FlippingAnImage solution = new FlippingAnImage()
        assert dst.equals(solution.reverse(src))

    }

    void testInvert() {
        int[] src = [1, 0, 0]
        int[] dst = [0, 1, 1]
        FlippingAnImage solution = new FlippingAnImage()
        assert dst.equals(solution.invert(src))
    }
}
