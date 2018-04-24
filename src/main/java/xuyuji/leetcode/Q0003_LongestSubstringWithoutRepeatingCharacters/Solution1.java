package xuyuji.leetcode.Q0003_LongestSubstringWithoutRepeatingCharacters;

import java.util.Stack;

public class Solution1 {
	public int lengthOfLongestSubstring(String s) {
		int lengthOfLongest = 0;
		Stack<Character> stack = new Stack<Character>();

		int currentLength = 0;
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if (stack.contains(c)) {
				if (currentLength > lengthOfLongest) {
					lengthOfLongest = currentLength;
				}
				do {
					i = i - 1;
				} while (c != stack.pop());
				currentLength = 0;
				stack.clear();
			} else {
				stack.push(c);
				currentLength = currentLength + 1;
			}
		}
		if (currentLength > lengthOfLongest) {
			lengthOfLongest = currentLength;
		}

		return lengthOfLongest;
	}
}
