package xuyuji.leetcode.Q0005_LongestPalindromicSubstring;

public class Solution1 {
	public String longestPalindrome(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length() + 1; j++) {
				String subStr = s.substring(i, j);
				if (isPalindrome(subStr) && result.length() < subStr.length()) {
					result = subStr;
				}
			}
		}
		return result;
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
