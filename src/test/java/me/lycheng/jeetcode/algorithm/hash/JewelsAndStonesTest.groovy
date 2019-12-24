package me.lycheng.jeetcode.algorithm.hash

class JewelsAndStonesTest extends GroovyTestCase {
    void testNumJewelsInStones() {

        def J = "aA"
        def S = "aAAbbbb"

        JewelsAndStones solution = new JewelsAndStones();
        assertEquals(3, solution.numJewelsInStones(J, S))

        J = "z"
        S = "ZZ"
        assertEquals(0, solution.numJewelsInStones(J, S))

    }
}
