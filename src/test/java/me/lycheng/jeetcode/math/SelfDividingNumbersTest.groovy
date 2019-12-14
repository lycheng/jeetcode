package me.lycheng.jeetcode.math

class SelfDividingNumbersTest extends GroovyTestCase {

    SelfDividingNumbers solution = new SelfDividingNumbers()

    void testSelfDividingNumbers() {

        int left = 1
        int right = 22

        def expected = [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]

        assert expected.equals(solution.selfDividingNumbers(left, right))
    }

    void testIsSelfDividing() {
        def cases = [
                1  : true,
                10 : false,
                11 : true,
                101: false
        ]
        cases.each { k, v ->
            assert v == solution.isSelfDividing(k)
        }
    }
}
