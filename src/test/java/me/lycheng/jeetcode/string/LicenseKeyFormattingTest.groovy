package me.lycheng.jeetcode.string

class LicenseKeyFormattingTest extends GroovyTestCase {

    LicenseKeyFormatting l = new LicenseKeyFormatting()

    void testLicenseKeyFormatting() {

        def S = "5F3Z-2e-9-w"
        def K = 4
        def expected = "5F3Z-2E9W"

        assertEquals(expected, l.licenseKeyFormatting(S, K))

        S = "2-5g-3-J"
        K = 2
        expected = "2-5G-3J"

        assertEquals(expected, l.licenseKeyFormatting(S, K))
    }
}
