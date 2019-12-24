package me.lycheng.jeetcode.algorithm.design

class MinStackTest extends GroovyTestCase {

    void testMinStack() {
         def stack = new MinStack()

        stack.push(1)
        stack.push(2)
        stack.push(3)
        stack.push(-1)

        assert stack.getMin() == -1
        stack.pop()
        assert stack.getMin() == 1

    }
}
