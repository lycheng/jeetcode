package me.lycheng.jeetcode.algorithm.string

class DecryptStringFromAlphabetToIntegerMappingTest extends GroovyTestCase {
    void testFreqAlphabets() {
        def solution = new DecryptStringFromAlphabetToIntegerMapping()
        def cases = [
            "10#11#12": "jkab",
            "1326#": "acz",
            "25#": "y"
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.freqAlphabets(input))
        }
    }
}
