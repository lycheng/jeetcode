package me.lycheng.jeetcode.algorithm.array

class RelativeSortArrayTest extends GroovyTestCase {
    void testRelativeSortArray() {
        def solution = new RelativeSortArray()

        def arr1 = [2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19] as int[]
        def arr2 = [2, 1, 4, 3, 9, 6] as int[]
        def expected = [2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19] as int[]

        assertEquals(expected, solution.relativeSortArray(arr1, arr2))
    }
}
