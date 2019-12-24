package me.lycheng.jeetcode.algorithm.array

class SortArrayByParityTest extends GroovyTestCase {
    void testSortArrayByParity() {

        SortArrayByParity solution = new SortArrayByParity()
        int[] src = [3, 1, 2, 4]
        int[] dst = [4, 2, 1, 3]

        assert dst.equals(solution.sortArrayByParity(src))
    }
}
