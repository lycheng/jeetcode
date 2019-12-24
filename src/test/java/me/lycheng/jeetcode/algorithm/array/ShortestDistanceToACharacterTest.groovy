package me.lycheng.jeetcode.algorithm.array

class ShortestDistanceToACharacterTest extends GroovyTestCase {

    ShortestDistanceToACharacter sda = new ShortestDistanceToACharacter()

    void testShortestToChar() {

        String S = "loveleetcode"
        char C = 'e'

        int[] expected = [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
        assert expected.equals(sda.shortestToChar(S, C))
    }
}
