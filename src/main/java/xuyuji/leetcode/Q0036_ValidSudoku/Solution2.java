package xuyuji.leetcode.Q0036_ValidSudoku;

public class Solution2 {
	public boolean isValidSudoku(char[][] board) {
		int[][] signs = new int[3][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '.')
					continue;
				int n = 1 << (board[i][j] - '1');
				int cubeIndex = i / 3 * 3 + j / 3;
				if ((signs[0][i] & n) != 0 || (signs[1][j] & n) != 0 || (signs[2][cubeIndex] & n) != 0)
					return false;
				signs[0][i] |= n;
				signs[1][j] |= n;
				signs[2][cubeIndex] |= n;
			}
		}
		return true;
	}
}
