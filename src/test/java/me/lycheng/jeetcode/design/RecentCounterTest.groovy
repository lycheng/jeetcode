package me.lycheng.jeetcode.design

class RecentCounterTest extends GroovyTestCase {
    void testPing() {

        RecentCounter counter = new RecentCounter()

        def cases = [
                1   : 1,
                100 : 2,
                3001: 3,
                3002: 3
        ]

        cases.each { input, expected ->
            assertEquals(expected, counter.ping(input))
        }
    }
}
