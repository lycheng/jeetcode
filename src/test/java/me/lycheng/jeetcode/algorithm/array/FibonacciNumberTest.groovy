package me.lycheng.jeetcode.algorithm.array

class FibonacciNumberTest extends GroovyTestCase {
    void testFib() {
        FibonacciNumber fib = new FibonacciNumber()

        def cases = [
                2: 1,
                3: 2,
                4: 3,
        ]

        cases.each { input, expected ->
            assert fib.fib(input) == expected
        }
    }
}
