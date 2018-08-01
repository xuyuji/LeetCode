package xuyuji.leetcode.Q0062_UniquePaths;

public class Solution2 {

	public int uniquePaths(int m, int n) {
		if (m <= 1 || n <= 1) {
			return 1;
		}

		int[][] map = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j == 0) {
					map[i][j] = 1;
				} else if (i == 0) {
					map[i][j] = map[i][j - 1];
				} else if (j == 0) {
					map[i][j] = map[i - 1][j];
				} else {
					map[i][j] = map[i - 1][j] + map[i][j - 1];
				}
			}
		}

		return map[m - 1][n - 1];
	}
}
