package me.lycheng.jeetcode.algorithm.string

class LongestUncommonSubsequenceITest extends GroovyTestCase {
    void testFindLUSlength() {
        def solution = new LongestUncommonSubsequenceI()
        def a = "aba"
        def b = "cdc"
        def expected = 3
        assertEquals(expected, solution.findLUSlength(a, b))
    }
}
