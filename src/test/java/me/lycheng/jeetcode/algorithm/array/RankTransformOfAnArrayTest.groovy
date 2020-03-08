package me.lycheng.jeetcode.algorithm.array

class RankTransformOfAnArrayTest extends GroovyTestCase {
    void testArrayRankTransform() {

        def solution = new RankTransformOfAnArray()
        def cases = [
                [40, 10, 20, 30]                   : [4, 1, 2, 3],
                [100, 100, 100]                    : [1, 1, 1],
                [37, 12, 28, 9, 100, 56, 80, 5, 12]: [5, 3, 4, 2, 8, 6, 7, 1, 3],
                []: []
        ]

        cases.each{input, expected ->
            assertEquals(expected as int[], solution.arrayRankTransform(input as int[]))
        }
    }
}
