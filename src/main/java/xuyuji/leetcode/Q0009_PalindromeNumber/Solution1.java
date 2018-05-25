package xuyuji.leetcode.Q0009_PalindromeNumber;

public class Solution1 {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}

		if (x < 10) {
			return true;
		}

		return isPalindrome(String.valueOf(x));
	}

	private boolean isPalindrome(String s) {
		char[] ca = s.toCharArray();
		for (int i = 0; i < ca.length; i++) {
			if (ca[i] != ca[ca.length - 1 - i]) {
				return false;
			}
		}

		return true;
	}
}
