package me.lycheng.jeetcode.algorithm.array

class FindPivotIndexTest extends GroovyTestCase {
    void testPivotIndex() {
        def cases = [
                "3" : [1, 7, 3, 6, 5, 6],
                "-1": [1, 2, 3]
        ]

        FindPivotIndex o = new FindPivotIndex()
        cases.each { k, v ->

            assert o.pivotIndex((int[]) v) == k.toInteger()
        }
    }
}
