package xuyuji.leetcode.Q0242_ValidAnagram;

public class Solution1 {
	public boolean isAnagram(String s, String t) {
		if (s == null || t == null || s.length() != t.length()) {
			return false;
		}

		if (s.length() == 0) {
			return true;
		}

		int[] map = new int[26];
		for (char c : s.toCharArray()) {
			map[c - 'a']++;
		}
		for (char c : t.toCharArray()) {
			map[c - 'a']--;
		}
		for (int i : map) {
			if (i != 0) {
				return false;
			}
		}
		return true;
	}
}
