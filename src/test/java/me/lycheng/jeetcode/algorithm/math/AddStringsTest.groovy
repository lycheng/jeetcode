package me.lycheng.jeetcode.algorithm.math

class AddStringsTest extends GroovyTestCase {
    void testAddStrings() {
        def o = new AddStrings()

        assert o.addStrings("0", "0") == "0"
        assert o.addStrings("0", "123") == "123"
        assert o.addStrings("123", "12") == "135"

    }
}
