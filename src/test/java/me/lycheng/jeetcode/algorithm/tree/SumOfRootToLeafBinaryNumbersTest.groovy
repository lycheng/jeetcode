package me.lycheng.jeetcode.algorithm.tree

import me.lycheng.jeetcode.TreeNode

class SumOfRootToLeafBinaryNumbersTest extends GroovyTestCase {
    void testSumRootToLeaf() {
        def solution = new SumOfRootToLeafBinaryNumbers()
        def cases = [
                (TreeNode.fromList([1, 0, 1]))            : 5,
                (TreeNode.fromList([1, 0, 1, 0, 1, 0, 1])): 22

        ]

        cases.each { input, expected ->
            assertEquals(expected, solution.sumRootToLeaf(input))
        }
    }
}
