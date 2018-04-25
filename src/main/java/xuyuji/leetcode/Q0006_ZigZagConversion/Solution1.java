package xuyuji.leetcode.Q0006_ZigZagConversion;

public class Solution1 {
	public String convert(String s, int numRows) {
		if (numRows < 2) {
			return s;
		}

		int len = s.length();
		int index = 0;
		int m = 2 * numRows - 2;
		char[] array = s.toCharArray();
		char[] result = new char[len];

		for (int i = 0; i < numRows; i++) {
			int x = i;
			int y = m - i;
			if ((y - x) % m == 0) {
				while (x < len) {
					result[index++] = array[x];
					x = x + m;
				}
			} else {
				while (x < len || y < len) {
					if (x < len) {
						result[index++] = array[x];
						x = x + m;
					}

					if (y < len) {
						result[index++] = array[y];
						y = y + m;
					}
				}
			}

		}

		return String.valueOf(result);
	}
}
