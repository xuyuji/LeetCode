package xuyuji.leetcode.Q0048_RotateImage;

public class Solution1 {
	public void rotate(int[][] matrix) {
		int len = matrix.length;
		for (int i = 0; i < len / 2; i++) {
			for (int j = i; j < len - 1 - i; j++) {
				int x = i;
				int y = j;
				int t = matrix[x][y];
				for (int k = 0; k < 3; k++) {
					int x_ = len - 1 - y;
					int y_ = x;
					matrix[x][y] = matrix[x_][y_];
					x = x_;
					y = y_;
				}
				matrix[x][y] = t;
			}
		}
	}
}
