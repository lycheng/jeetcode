package me.lycheng.jeetcode.algorithm.math

class ProjectionAreaOf3DShapesTest extends GroovyTestCase {

    ProjectionAreaOf3DShapes p = new ProjectionAreaOf3DShapes()

    void testProjectionArea() {
        int[][] grid = [[2]]
        int expected = 5

        assertEquals(expected, p.projectionArea(grid))

        grid = [[1,2],[3,4]]
        expected = 17
        assertEquals(expected, p.projectionArea(grid))

    }
}
