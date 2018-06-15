package xuyuji.leetcode.Q0014_LongestCommonPrefix;

import java.io.IOException;

public class Solution1 {
	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		if (strs.length == 1) {
			return strs[0];
		}

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < strs[0].length(); i++) {
			char c = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				String str = strs[j];
				if (str.length() <= i || c != str.charAt(i)) {
					return result.toString();
				}
			}
			result.append(c);
		}
		return result.toString();
	}

	public static void main(String[] args) throws IOException {
		Solution1 solution = new Solution1();
		System.out.println(solution.longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
	}
}
