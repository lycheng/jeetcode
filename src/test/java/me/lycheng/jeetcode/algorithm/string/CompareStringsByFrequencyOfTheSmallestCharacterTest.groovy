package me.lycheng.jeetcode.algorithm.string

class CompareStringsByFrequencyOfTheSmallestCharacterTest extends GroovyTestCase {
    void testNumSmallerByFrequency() {
        def solution = new CompareStringsByFrequencyOfTheSmallestCharacter()

        def queries = ["cbd"] as String[]
        def words = ["zaaaz"] as String[]
        def expected = [1] as int[]
        assertEquals(expected, solution.numSmallerByFrequency(queries, words))

        queries = ["bbb", "cc"] as String[]
        words = ["a", "aa", "aaa", "aaaa"] as String[]
        expected = [1, 2] as int[]
        assertEquals(expected, solution.numSmallerByFrequency(queries, words))
    }
}
