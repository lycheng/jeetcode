package me.lycheng.jeetcode.algorithm.array

class DecompressRunLengthEncodedListTest extends GroovyTestCase {
    void testDecompressRLElist() {
        def solution = new DecompressRunLengthEncodedList()
        def cases = [
                [1, 2, 3, 4]: [2, 4, 4, 4]
        ]
        cases.each {input, expected ->
            assertEquals(expected as int[], solution.decompressRLElist(input as int[]))
        }
    }
}
