package me.lycheng.jeetcode.algorithm.array

class RemoveOutermostParenthesesTest extends GroovyTestCase {
    void testRemoveOuterParentheses() {
        def solution = new RemoveOutermostParentheses()
        def cases = [
                "(()())(())": "()()()",
                "(()())(())(()(()))": "()()()()(())",
                "()()": ""
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.removeOuterParentheses(input))
        }
    }
}
