package xuyuji.leetcode.Q0036_ValidSudoku;

public class Solution1 {
	public boolean isValidSudoku(char[][] board) {
		if (board == null || board.length != 9 || board[0].length != 9) {
			return false;
		}

		for (int i = 0; i < 9; i++) {
			int[] hMap = new int[9]; // 横向
			int[] vMap = new int[9]; // 竖向
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					int n = board[i][j] - '1';
					if (hMap[n] == 0) {
						hMap[n]++;
					} else {
						return false;
					}
				}
				if (board[j][i] != '.') {
					int n = board[j][i] - '1';
					if (vMap[n] == 0) {
						vMap[n]++;
					} else {
						return false;
					}
				}
			}
		}

		for (int i = 0; i < 9; i += 3) {
			for (int j = 0; j < 9; j += 3) {
				int[] sMap = new int[9]; // 方块
				for (int x = 0; x < 3; x++) {
					for (int y = 0; y < 3; y++) {
						if (board[i + x][j + y] != '.') {
							int n = board[i + x][j + y] - '1';
							if (sMap[n] == 0) {
								sMap[n]++;
							} else {
								return false;
							}
						}
					}
				}
			}
		}

		return true;
	}
}
