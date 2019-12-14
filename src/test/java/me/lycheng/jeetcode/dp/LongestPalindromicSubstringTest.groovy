package me.lycheng.jeetcode.dp

import me.lycheng.jeetcode.math.PalindromeNumber

class LongestPalindromicSubstringTest extends GroovyTestCase {
    void testLongestPalindrome() {
        def cases = [
                "cabad": "aba",
                "cbbd": "bb",
                "a": "a",
                "": ""
        ]
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring()
        cases.each {k, v ->
            assert lps.longestPalindrome(k) == v
        }
    }
}
