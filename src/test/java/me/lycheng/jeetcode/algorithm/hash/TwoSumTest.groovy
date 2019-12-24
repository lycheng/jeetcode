package me.lycheng.jeetcode.algorithm.hash

class TwoSumTest extends GroovyTestCase {
    void testTwoSum() {
        def ts = new TwoSum()
        int[] lst = [2, 7, 11, 15]
        def rv = ts.twoSum(lst, 9).toList().sort();
        assert rv == [0, 1]
    }
}
