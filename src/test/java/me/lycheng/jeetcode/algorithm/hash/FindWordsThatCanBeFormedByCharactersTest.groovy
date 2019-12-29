package me.lycheng.jeetcode.algorithm.hash

class FindWordsThatCanBeFormedByCharactersTest extends GroovyTestCase {
    void testCountCharacters() {
        def solution = new FindWordsThatCanBeFormedByCharacters()

        def words = ["cat", "bt", "hat", "tree"] as String[]
        def chars = "atach"
        def expected = 6

        assertEquals(expected, solution.countCharacters(words, chars))

        words = ["hello", "world", "leetcode"] as String[]
        chars = "welldonehoneyr"
        expected = 10
        assertEquals(expected, solution.countCharacters(words, chars))

    }
}
