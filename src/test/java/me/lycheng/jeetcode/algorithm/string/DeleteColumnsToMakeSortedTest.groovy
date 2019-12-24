package me.lycheng.jeetcode.algorithm.string

class DeleteColumnsToMakeSortedTest extends GroovyTestCase {
    void testMinDeletionSize() {
        DeleteColumnsToMakeSorted solution = new DeleteColumnsToMakeSorted()

        String[] src = ["cba", "daf", "ghi"]
        int dst = 1

        assertEquals(dst, solution.minDeletionSize(src))

        src = ["rrjk", "furt", "guzm"]
        dst = 2
        assertEquals(dst, solution.minDeletionSize(src))

        src = ["qowfc", "spyge", "sqbif", "vvrkk"]
        dst = 1
        assertEquals(dst, solution.minDeletionSize(src))
    }
}
