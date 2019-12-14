package me.lycheng.jeetcode.math

class DIStringMatchTest extends GroovyTestCase {
    void testDiStringMatch() {

        DIStringMatch solution = new DIStringMatch()

        String input = "IDID"
        int[] output = [0, 4, 1, 3, 2]

        assert output.equals(solution.diStringMatch(input))

    }
}
