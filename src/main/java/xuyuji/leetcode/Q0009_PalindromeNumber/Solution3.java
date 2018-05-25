package xuyuji.leetcode.Q0009_PalindromeNumber;

public class Solution3 {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}

		if (x < 10) {
			return true;
		}

		int num = x;
		int antiX = 0;
		while (num != 0) {
			antiX = antiX * 10 + num % 10;
			num = num / 10;
		}

		return antiX == x;
	}
}
