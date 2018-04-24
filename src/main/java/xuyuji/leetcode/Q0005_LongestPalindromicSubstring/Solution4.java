package xuyuji.leetcode.Q0005_LongestPalindromicSubstring;

public class Solution4 {
	public String longestPalindrome(String s) {
		if (s.length() <= 1) {
			return s;
		}

		char[] array = s.toCharArray();
		int[] range = new int[] { 0, 1 };

		for (int i = 0; i < s.length(); i++) {
			expand(array, i, range);
		}

		return s.substring(range[0], range[1]);
	}

	public void expand(char[] array, int index, int[] range) {
		int low = index;
		int high = index;

		while (high < array.length - 1 && array[low] == array[high + 1]) {
			high++;
		}

		while (low >= 1 && high < array.length - 1 && array[low - 1] == array[high + 1]) {
			low--;
			high++;
		}

		if (high + 1 - low > range[1] - range[0]) {
			range[1] = high + 1;
			range[0] = low;
		}
	}
}
