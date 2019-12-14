package me.lycheng.jeetcode.math

class ReverseIntegerTest extends GroovyTestCase {
    void testReverse() {
        int [][]cases = [
                [123, 321],
                [-123, -321],
                [120, 21],
                [0, 0],
                [1, 1],
                [1534236469, 0]
        ]

        ReverseInteger ri = new ReverseInteger();
        cases.eachWithIndex{ int[] entry, int i ->
            assert ri.reverse(entry[0]) == entry[1]
        }
    }
}
