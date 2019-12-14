package me.lycheng.jeetcode.string

class ToLowerCaseTest extends GroovyTestCase {
    void testToLowerCase() {
        def cases = [
                "Hello": "hello",
                "here": "here",
                "LOVELY": "lovely"
        ]

        ToLowerCase solution = new ToLowerCase();
        cases.each {k, v ->
            assert v == solution.toLowerCase(k)
        }
    }
}
