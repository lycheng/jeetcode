package me.lycheng.jeetcode.hash

class FindCommonCharactersTest extends GroovyTestCase {

    FindCommonCharacters f = new FindCommonCharacters()

    void testCommonChars() {

        def input = ["acabcddd", "bcbdbcbd", "baddbadb", "cbdddcac", "aacbcccd", "ccccddda", "cababaab", "addcaccd"] as String[]
        def expected = []
        assertEquals(expected, f.commonChars(input).sort())

        input = ["bella", "label", "roller"] as String[]
        expected = ["e", "l", "l"].sort()
        assertEquals(expected, f.commonChars(input).sort())

        input = ["cool", "lock", "cook"] as String[]
        expected = ["c", "o"].sort()
        assertEquals(expected, f.commonChars(input).sort())
    }
}
