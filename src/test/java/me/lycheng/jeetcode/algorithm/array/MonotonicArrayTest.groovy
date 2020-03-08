package me.lycheng.jeetcode.algorithm.array

class MonotonicArrayTest extends GroovyTestCase {
    void testIsMonotonic() {
        def solution = new MonotonicArray()
        def cases = [
                [1,2,2,3]: true,
                [6,5,4,4]: true,
                [1,3,2]: false,
                [1,2,4,5]: true,
                [1, 1, 1]: true
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.isMonotonic(input as int[]))
        }
    }
}
