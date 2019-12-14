package me.lycheng.jeetcode.string

class UniqueMorseCodeWordsTest extends GroovyTestCase {
    void testUniqueMorseRepresentations() {
        UniqueMorseCodeWords solution = new UniqueMorseCodeWords()

        String[] words = ["gin", "zen", "gig", "msg"]
        assertEquals(2, solution.uniqueMorseRepresentations(words))

    }
}
