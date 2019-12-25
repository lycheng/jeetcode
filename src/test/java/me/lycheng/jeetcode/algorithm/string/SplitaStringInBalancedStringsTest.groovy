package me.lycheng.jeetcode.algorithm.string

class SplitaStringInBalancedStringsTest extends GroovyTestCase {
    void testBalancedStringSplit() {

        def solution = new SplitaStringInBalancedStrings()
        def cases = [
                "RLRRLLRLRL": 4,
                "RLLLLRRRLR": 3,
                "LLLLRRRR"  : 1,
                "RLRRRLLRLL": 2
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.balancedStringSplit(input))
        }
    }
}
