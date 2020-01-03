package me.lycheng.jeetcode.heap

class LastStoneWeightTest extends GroovyTestCase {
    void testLastStoneWeight() {
        def solution = new LastStoneWeight()
        def cases = [
                [2, 7, 4, 1, 8, 1]: 1
        ]
        cases.each { input, expected ->
            assertEquals(expected, solution.lastStoneWeight(input as int[]))
        }
    }
}
