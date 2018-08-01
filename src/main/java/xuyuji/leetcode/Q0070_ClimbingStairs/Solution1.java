package xuyuji.leetcode.Q0070_ClimbingStairs;

class Solution1 {

	private int[] climbStairs;

	public int climbStairs(int n) {
		if (n <= 0) {
			return 0;
		}

		climbStairs = new int[n];

		return climbStair(n);
	}

	private int climbStair(int n) {
		if (climbStairs[n - 1] != 0) {
			return climbStairs[n - 1];
		}

		if (n == 1 || n == 2) {
			climbStairs[n - 1] = n;
		} else {
			climbStairs[n - 1] = climbStair(n - 1) + climbStair(n - 2);
		}

		return climbStairs[n - 1];
	}
}
