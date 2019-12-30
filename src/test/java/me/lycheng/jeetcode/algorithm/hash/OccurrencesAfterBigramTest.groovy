package me.lycheng.jeetcode.algorithm.hash

class OccurrencesAfterBigramTest extends GroovyTestCase {
    void testFindOcurrences() {
        def solution = new OccurrencesAfterBigram()

        def text = "alice is a good girl she is a good student"
        def first = "a"
        def second = "good"

        assertEquals(["girl","student"] as String[], solution.findOcurrences(text, first, second))
    }
}
