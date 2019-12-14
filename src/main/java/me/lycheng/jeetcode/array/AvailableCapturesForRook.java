package me.lycheng.jeetcode.array;

/**
 * https://leetcode.com/problems/available-captures-for-rook/
 */
public class AvailableCapturesForRook {

    public int numRookCaptures(char[][] board) {
        int t = getRock(board);
        int x = t / 10;
        int y = t % 10;
        int maxIndex = 8;
        int res = 0;

        for (int i = x + 1; i < maxIndex; i++) {
            if (board[i][y] == '.')
                continue;
            if (board[i][y] != 'p')
                break;
            res += 1;
            break;
        }

        for (int i = x - 1; i >= 0; i--) {
            if (board[i][y] == '.')
                continue;
            if (board[i][y] != 'p')
                break;
            res += 1;
            break;
        }

        for (int i = y + 1; i < maxIndex; i++) {
            if (board[x][i] == '.')
                continue;
            if (board[x][i] != 'p')
                break;
            res += 1;
            break;
        }

        for (int i = y - 1; i >= 0; i--) {
            if (board[x][i] == '.')
                continue;
            if (board[x][i] != 'p')
                break;
            res += 1;
            break;
        }

        return res;
    }

    private int getRock(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    return i * 10 + j;
                }
            }
        }
        return -1;
    }
}
