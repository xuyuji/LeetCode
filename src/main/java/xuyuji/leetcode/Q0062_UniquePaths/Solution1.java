package xuyuji.leetcode.Q0062_UniquePaths;

public class Solution1 {
	private int[][] map;

	public int uniquePaths(int m, int n) {
		if (m <= 1 || n <= 1) {
			return 1;
		}
		map = new int[m][n];

		return uniquePath(m, n);
	}

	private int uniquePath(int m, int n) {
		if (m <= 1 || n <= 1) {
			return 1;
		}
		if (map[m - 1][n - 1] == 0) {
			map[m - 1][n - 1] = uniquePath(m - 1, n) + uniquePath(m, n - 1);
		}
		return map[m - 1][n - 1];
	}
}
