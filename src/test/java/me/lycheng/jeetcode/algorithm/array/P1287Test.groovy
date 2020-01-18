package me.lycheng.jeetcode.algorithm.array

class P1287Test extends GroovyTestCase {
    void testFindSpecialInteger() {
        def solution = new P1287()
        def cases = [
                [1, 2, 2, 6, 6, 6, 6, 7, 10]: 6
        ]
        cases.each {input, expected ->
            assertEquals(expected, solution.findSpecialInteger(input as int[]))
        }
    }
}
