package me.lycheng.jeetcode.algorithm.array

class DuplicateZerosTest extends GroovyTestCase {
    void testDuplicateZeros() {
        def solution = new DuplicateZeros()
        def cases = [
                [1, 0, 2, 3, 0, 4, 5, 0]: [1, 0, 0, 2, 3, 0, 0, 4],
                [1, 2, 3]               : [1, 2, 3]
        ]

        cases.each { input, expected ->
            def arr = input as int[]
            solution.duplicateZeros(arr)
            assertEquals(expected as int[], arr)
        }
    }
}
