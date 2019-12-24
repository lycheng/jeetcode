package me.lycheng.jeetcode.algorithm.math

class PowerfulIntegersTest extends GroovyTestCase {

    PowerfulIntegers pi = new PowerfulIntegers()

    void testPowerfulIntegers() {

        def x = 2
        def y = 3
        def bound = 10
        def expected = [2, 3, 4, 5, 7, 9, 10]
        assert expected == pi.powerfulIntegers(x, y, bound).toSorted()

        x = 3
        y = 5
        bound = 15
        expected = [2, 4, 6, 8, 10, 14]
        assert expected == pi.powerfulIntegers(x, y, bound).toSorted()

        x = 1
        y = 2
        bound = 100
        expected = [2, 3, 5, 9, 17, 33, 65]
        assert expected == pi.powerfulIntegers(x, y, bound).toSorted()
    }
}
