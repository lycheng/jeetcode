package me.lycheng.jeetcode.algorithm.array

class DistanceBetweenBusStopsTest extends GroovyTestCase {
    void testDistanceBetweenBusStops() {
        def solution = new DistanceBetweenBusStops()
        def distance = [1, 2, 3, 4]
        def start = 0
        def destination = 1
        def rv = 1

        assertEquals(rv, solution.distanceBetweenBusStops(distance as int[], start, destination))

        start = 0
        destination = 2
        rv = 3
        assertEquals(rv, solution.distanceBetweenBusStops(distance as int[], start, destination))
    }
}
