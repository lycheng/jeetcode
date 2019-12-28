package me.lycheng.jeetcode.algorithm.math

import me.lycheng.jeetcode.CustomFunction

class Function1 implements CustomFunction {
    @Override
    int f(int x, int y) {
        return x + y
    }
}

class Function2 implements CustomFunction {

    @Override
    int f(int x, int y) {
        return x * y
    }
}

class FindPositiveIntegerSolutionForaGivenEquationTest extends GroovyTestCase {
    void testFindSolution() {
        def solution = new FindPositiveIntegerSolutionForaGivenEquation()

        def cf = new Function1()
        assertEquals(4, solution.findSolution(cf, 5).size())

        cf = new Function2()
        assertEquals(2, solution.findSolution(cf, 5).size())
    }
}
