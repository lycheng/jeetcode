package me.lycheng.jeetcode.algorithm.string

class GroupsOfSpecialEquivalentStringsTest extends GroovyTestCase {

    GroupsOfSpecialEquivalentStrings solution = new GroupsOfSpecialEquivalentStrings()

    void testNumSpecialEquivGroups() {

        def input = ["a", "b", "c", "a", "c", "c"] as String[]
        def expected = 3
        assertEquals(expected, solution.numSpecialEquivGroups(input))

        input = ["abc", "acb", "bac", "bca", "cab", "cba"] as String[]
        expected = 3
        assertEquals(expected, solution.numSpecialEquivGroups(input))

        input = ["abcd", "cdab", "adcb", "cbad"] as String[]
        expected = 1
        assertEquals(expected, solution.numSpecialEquivGroups(input))
    }
}
