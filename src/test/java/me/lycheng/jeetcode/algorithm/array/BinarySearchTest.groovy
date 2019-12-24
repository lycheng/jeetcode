package me.lycheng.jeetcode.algorithm.array

class BinarySearchTest extends GroovyTestCase {
    void testSearch() {

        BinarySearch bs = new BinarySearch();
        int[] nums = [-1, 0, 3, 5, 9, 12]
        assert bs.search(nums, 9) == 4
        assert bs.search(nums, 2) == -1
    }
}
