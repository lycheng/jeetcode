package me.lycheng.jeetcode.string

class LongestCommonPrefixTest extends GroovyTestCase {
    void testLongestCommonPrefix() {
        def cases = [
                "fl": ["flower", "flow", "flight"],
                ""  : ["dog", "racecar", "car"]
        ]
        LongestCommonPrefix lcp = new LongestCommonPrefix()
        cases.each { k, v ->
            def data = v as String[]
            assert lcp.longestCommonPrefix(data) == k
        }
    }
}
