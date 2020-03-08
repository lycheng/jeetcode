package me.lycheng.jeetcode.algorithm.hash

class ShortestCompletingWordTest extends GroovyTestCase {
    void testShortestCompletingWord() {
        def solution = new ShortestCompletingWord()

        def licensePlate = "1s3 PSt"
        def words = ["step", "steps", "stripe", "stepple"]
        def expected = "steps"
        assertEquals(expected, solution.shortestCompletingWord(licensePlate, words as String[]))
    }
}
