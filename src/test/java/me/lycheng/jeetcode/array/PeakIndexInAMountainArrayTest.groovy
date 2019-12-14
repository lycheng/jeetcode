package me.lycheng.jeetcode.array

class PeakIndexInAMountainArrayTest extends GroovyTestCase {
    void testPeakIndexInMountainArray() {
        PeakIndexInAMountainArray solution = new PeakIndexInAMountainArray()

        int[] input = [0, 1, 0]
        int output = 1

        assertEquals(output, solution.peakIndexInMountainArray(input))
    }
}
