package xuyuji.leetcode.Q0009_PalindromeNumber;

import java.util.LinkedList;
import java.util.List;

public class Solution2 {
	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}

		if (x < 10) {
			return true;
		}

		int num = x;
		List<Short> list = new LinkedList<Short>();
		while (num > 0) {
			list.add((short) (num % 10));
			num = num / 10;
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != list.get(list.size() - 1 - i)) {
				return false;
			}
		}

		return true;
	}
}
