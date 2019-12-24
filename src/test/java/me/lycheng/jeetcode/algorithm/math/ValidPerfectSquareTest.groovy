package me.lycheng.jeetcode.algorithm.math

class ValidPerfectSquareTest extends GroovyTestCase {

    ValidPerfectSquare v = new ValidPerfectSquare()

    void testIsPerfectSquare() {

        def cases = [
                16: true,
                14: false
        ]

        cases.each { n, res ->
            assert v.isPerfectSquare(n) == res
            assert v.isPerfectSquareWithBinarySearch(n) == res
        }
    }
}
