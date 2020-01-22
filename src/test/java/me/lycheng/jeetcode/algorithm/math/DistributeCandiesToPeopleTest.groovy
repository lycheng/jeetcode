package me.lycheng.jeetcode.algorithm.math

class DistributeCandiesToPeopleTest extends GroovyTestCase {
    void testDistributeCandies() {
        def solution = new DistributeCandiesToPeople()
        def candies = 7
        def num_people = 4
        def expected = [1, 2, 3, 1] as int[]

        assertEquals(expected, solution.distributeCandies(candies, num_people))
    }
}
