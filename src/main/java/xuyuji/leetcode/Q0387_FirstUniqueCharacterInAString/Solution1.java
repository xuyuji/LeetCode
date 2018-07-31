package xuyuji.leetcode.Q0387_FirstUniqueCharacterInAString;

public class Solution1 {
	public int firstUniqChar(String s) {
		int[] map = new int[123];
		char[] array = s.toCharArray();
		for (char c : array) {
			map[c]++;
		}

		for (int i = 0; i < array.length; i++) {
			if (map[array[i]] == 1) {
				return i;
			}
		}

		return -1;
	}
}
