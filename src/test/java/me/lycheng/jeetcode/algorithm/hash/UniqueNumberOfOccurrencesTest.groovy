package me.lycheng.jeetcode.algorithm.hash

class UniqueNumberOfOccurrencesTest extends GroovyTestCase {
    void testUniqueOccurrences() {
        def solution = new UniqueNumberOfOccurrences()
        def arr = [1, 2, 2, 1, 1, 3] as int[]
        assertTrue(solution.uniqueOccurrences(arr))

        arr = [1, 2] as int[]
        assertFalse(solution.uniqueOccurrences(arr))

        arr = [-3, 0, 1, -3, 1, 1, 1, -3, 10, 0] as int[]
        assertTrue(solution.uniqueOccurrences(arr))
    }
}
