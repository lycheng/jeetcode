package me.lycheng.jeetcode.math

class PalindromeNumberTest extends GroovyTestCase {
    void testIsPalindrome() {
        def cases = [
                "-1": false,
                "1": true,
                "121": true,
                "10": false
        ]

        PalindromeNumber pn = new PalindromeNumber();
        cases.each {k, v ->
            int n = k.toInteger()
            assert v == pn.isPalindrome(n)
        }
    }
}
