package me.lycheng.jeetcode.algorithm.string

class DefangingAnIPAddressTest extends GroovyTestCase {
    void testDefangIPaddr() {

        def solution = new DefangingAnIPAddress()
        def cases = [
                "1.1.1.1"     : "1[.]1[.]1[.]1",
                "255.100.50.0": "255[.]100[.]50[.]0"
        ]

        cases.each { input, expected ->
            assertEquals(expected, solution.defangIPaddr(input))
        }
    }
}
