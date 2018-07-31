package xuyuji.leetcode.Q0125_ValidPalindrome;

public class Solution1 {
	public boolean isPalindrome(String s) {
		if (s == null || s.length() == 0) {
			return true;
		}
		char[] array = s.toLowerCase().toCharArray();
		int left = 0;
		int right = array.length - 1;
		while (left < right) {
			while (!isValidChar(array[left])) {
				left++;
				if (left >= right) {
					return true;
				}
			}
			while (!isValidChar(array[right])) {
				right--;
				if (left >= right) {
					return true;
				}
			}
			if (array[left] == array[right]) {
				left++;
				right--;
			} else {
				return false;
			}
		}
		return true;
	}

	private boolean isValidChar(char c) {
		return ('a' <= c & c <= 'z') || ('0' <= c && c <= '9');
	}
}
