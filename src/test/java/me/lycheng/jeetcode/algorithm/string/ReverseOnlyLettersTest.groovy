package me.lycheng.jeetcode.algorithm.string

class ReverseOnlyLettersTest extends GroovyTestCase {
    void testReverseOnlyLetters() {
        def solution = new ReverseOnlyLetters()
        def cases = [
                "ab-cd"               : "dc-ba",
                "a-bC-dEf-ghIj"       : "j-Ih-gfE-dCba",
                "Test1ng-Leet=code-Q!": "Qedo1ct-eeLg=ntse-T!"
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.reverseOnlyLetters(input))
        }
    }
}
