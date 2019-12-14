package me.lycheng.jeetcode.string

class NumberOfLinesToWriteStringTest extends GroovyTestCase {

    NumberOfLinesToWriteString n = new NumberOfLinesToWriteString()

    void testNumberOfLines() {

        int[] width = [10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                       10, 10, 10, 10]
        String S = "abcdefghijklmnopqrstuvwxyz"
        int[] expected = [3, 60]

        assert expected.equals(n.numberOfLines(width, S))

        width = [4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10]
        S = "bbbcccdddaaa"
        expected = [2, 4]

        assert expected.equals(n.numberOfLines(width, S))
    }
}
