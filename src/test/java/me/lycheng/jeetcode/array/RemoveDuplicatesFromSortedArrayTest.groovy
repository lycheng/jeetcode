package me.lycheng.jeetcode.array

class RemoveDuplicatesFromSortedArrayTest extends GroovyTestCase {
    void testRemoveDuplicates() {
        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray()

        int[] src = [1]
        assert r.removeDuplicates(src) == 1

        src = [1, 2, 3, 3, 4]

        assert r.removeDuplicates(src) == 4
        assert src[3] == 4

        src = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
        assert r.removeDuplicates(src) == 5
    }
}
