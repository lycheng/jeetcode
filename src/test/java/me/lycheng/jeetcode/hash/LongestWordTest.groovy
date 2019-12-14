package me.lycheng.jeetcode.hash

class LongestWordTest extends GroovyTestCase {
    void testLongestWord() {
        def lw = new LongestWord()
        String[] words = ["w","wo","wor","worl", "world"]

        assert lw.longestWord(words) == "world"

        words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
        assert lw.longestWord(words) == "apple"
    }
}
