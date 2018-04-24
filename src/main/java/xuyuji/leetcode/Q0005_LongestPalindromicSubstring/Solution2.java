package xuyuji.leetcode.Q0005_LongestPalindromicSubstring;

public class Solution2 {
	public String longestPalindrome(String s) {
		if (s == null) {
			return "";
		}
		if (s.length() == 1) {
			return s;
		}

		String result = "";

		for (int i = 0; i < s.length(); i++) {
			result = expand(s, i, i, result);
			result = expand(s, i, i + 1, result);
		}

		return result;
	}

	public String expand(String s, int low, int high, String longestStr) {
		String result = longestStr;
		while (low >= 0 && high < s.length()) {
			if (s.charAt(low) == s.charAt(high)) {
				if (high - low + 1 > result.length()) {
					result = s.substring(low, high + 1);
				}
				low--;
				high++;
			} else {
				break;
			}
		}

		return result;
	}
}
