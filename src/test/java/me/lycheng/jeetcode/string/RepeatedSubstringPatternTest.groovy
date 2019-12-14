package me.lycheng.jeetcode.string

class RepeatedSubstringPatternTest extends GroovyTestCase {

    RepeatedSubstringPattern rsp = new RepeatedSubstringPattern()

    void testRepeatedSubstringPattern() {
        def s = "abab"
        def expected = true
        assertEquals(expected, rsp.repeatedSubstringPattern(s))

        s = "aba"
        expected = false
        assertEquals(expected, rsp.repeatedSubstringPattern(s))

        s = "abcabcabcabc"
        expected = true
        assertEquals(expected, rsp.repeatedSubstringPattern(s))
    }

    void testIsRepeated() {

        def s = "aba"
        def endIndex = 0

        assert !rsp.isRepeated(endIndex, s)

        s = "abab"
        assert !rsp.isRepeated(endIndex, s)
        assert rsp.isRepeated(endIndex + 1, s)
    }
}
