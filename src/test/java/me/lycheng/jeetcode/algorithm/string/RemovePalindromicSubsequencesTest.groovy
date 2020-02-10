package me.lycheng.jeetcode.algorithm.string

class RemovePalindromicSubsequencesTest extends GroovyTestCase {
    void testRemovePalindromeSub() {
        def solution = new RemovePalindromicSubsequences()
        def cases = [
                "ababa": 1,
                "abb": 2,
                "": 0
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.removePalindromeSub(input))
        }
    }
}
