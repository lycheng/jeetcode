package me.lycheng.jeetcode.algorithm.hash

class UncommonWordsFromTwoSentencesTest extends GroovyTestCase {

    UncommonWordsFromTwoSentences solution = new UncommonWordsFromTwoSentences()

    void testUncommonFromSentences() {

        def a = "this apple is sweet"
        def b = "this apple is sour"
        def expected = ["sweet", "sour"].sort() as String[]

        assertArrayEquals(expected, solution.uncommonFromSentences(a, b).sort())

        a = "apple apple"
        b = "banana"
        expected = ["banana"] as String[]
        assertArrayEquals(expected, solution.uncommonFromSentences(a, b).sort())
    }
}
