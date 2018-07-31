package xuyuji.leetcode.Q0344_ReverseString;

public class Solution1 {
	public String reverseString(String s) {
		if (s == null || s.length() < 2) {
			return s;
		}

		char[] array = s.toCharArray();
		int left = 0;
		int right = array.length - 1;
		char temp;
		while (left < right) {
			temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
		return new String(array);
	}
}
