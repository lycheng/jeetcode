package me.lycheng.jeetcode.algorithm.hash

class SubdomainVisitCountTest extends GroovyTestCase {

    SubdomainVisitCount svc = new SubdomainVisitCount()

    void testSubdomainVisits() {

        String[] input = ["9001 discuss.leetcode.com"]
        List<String> expected = ["9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"]

        assert expected.sort().equals(svc.subdomainVisits(input).sort())

        input = ["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
        expected = ["901 mail.com", "50 yahoo.com", "900 google.mail.com", "5 wiki.org",
                    "5 org", "1 intel.mail.com", "951 com"]
        assert expected.sort().equals(svc.subdomainVisits(input).sort())
    }

    void testGetSubdomains() {
        def domain = "www.google.com"
        def expected = ["www.google.com", "google.com", "com"]

        assert expected.equals(svc.getSubdomains(domain))
    }
}
