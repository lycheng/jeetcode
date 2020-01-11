package me.lycheng.jeetcode.algorithm.math

class LetterCasePermutationTest extends GroovyTestCase {
    void testLetterCasePermutation() {
        def solution = new LetterCasePermutation()
        def cases = [
                "a1b2":  ["a1b2", "a1B2", "A1b2", "A1B2"],
                "3z4": ["3z4", "3Z4"],
                "12345": ["12345"]
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.letterCasePermutation(input));
        }
    }
}
