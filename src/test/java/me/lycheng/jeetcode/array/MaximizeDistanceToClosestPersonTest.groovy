package me.lycheng.jeetcode.array

class MaximizeDistanceToClosestPersonTest extends GroovyTestCase {

    MaximizeDistanceToClosestPerson m = new MaximizeDistanceToClosestPerson();

    void testMaxDistToClosest() {

        def seats = [1, 0, 0, 0, 1, 0, 1] as int[]
        def expected = 2

        assertEquals(expected, m.maxDistToClosest(seats))

        seats = [1, 0, 0, 0] as int[]
        expected = 3
        assertEquals(expected, m.maxDistToClosest(seats))
    }
}
