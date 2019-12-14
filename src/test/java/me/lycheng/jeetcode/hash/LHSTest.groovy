package me.lycheng.jeetcode.hash

class LHSTest extends GroovyTestCase {
    void testFindLHS() {
        def lhs = new LHS()
        int[] nums = [1, 3, 2, 2, 5, 2, 3, 7]

        assert lhs.findLHS(nums) == 5

        nums = [1, 2, 1, 3, 2, 3, 2]
        assert lhs.findLHS(nums) == 5

    }
}
