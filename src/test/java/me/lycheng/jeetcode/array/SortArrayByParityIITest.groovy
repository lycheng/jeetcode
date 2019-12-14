package me.lycheng.jeetcode.array

class SortArrayByParityIITest extends GroovyTestCase {
    void testSortArrayByParityII() {

        SortArrayByParityII solution = new SortArrayByParityII()

        int[] src = [4, 2, 5, 7]
        int[] expected = [4, 5, 2, 7]

        assert expected.equals(solution.sortArrayByParityII(src))
    }
}
