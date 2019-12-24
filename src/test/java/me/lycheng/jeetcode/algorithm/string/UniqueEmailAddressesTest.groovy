package me.lycheng.jeetcode.algorithm.string

class UniqueEmailAddressesTest extends GroovyTestCase {
    void testNumUniqueEmails() {

        String[] emails = [
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"
        ]
        UniqueEmailAddresses solution = new UniqueEmailAddresses();
        assertEquals(solution.numUniqueEmails(emails), 2)
    }

    void testFilterEmail() {
        def cases = [
                "alice@leetcode.com": "alice@leetcode.com",
                "alice.z@leetcode.com": "alicez@leetcode.com",
                "m.y+name@email.com": "my@email.com"
        ]

        UniqueEmailAddresses solution = new UniqueEmailAddresses();
        cases.each {k, v ->
            assert v == solution.filterEmail(k)
        }
    }
}
