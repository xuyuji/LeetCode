package xuyuji.leetcode.Q0028_ImplementStrStr;

public class Solution1 {
	public int strStr(String haystack, String needle) {
		if (needle == null || needle.length() == 0) {
			return 0;
		}

		char[] array = haystack.toCharArray();
		for (int i = 0; i <= array.length - needle.length(); i++) {
			if (array[i] == needle.charAt(0)) {
				int j = i;
				boolean flag = true;
				for (char c : needle.toCharArray()) {
					if (array[j] != c) {
						flag = false;
						break;
					}
					j++;
				}
				if (flag) {
					return i;
				}
			}
		}

		return -1;
	}
}
