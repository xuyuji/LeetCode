package xuyuji.leetcode.Q0008_StringtoIntegerAtoi;

public class Solution1 {
	public int myAtoi(String str) {
		if (str == null || str.isEmpty()) {
			return 0;
		}

		char[] arrays = str.toCharArray();

		long atoi = 0;
		int i = 0;
		while (arrays[i] == 32) {
			i++;
			if (i >= arrays.length) {
				return 0;
			}
		}

		short symbol = 1;
		if (arrays[i] == 43) {
			// 加号
			i++;
		} else if (arrays[i] == 45) {
			// 减号
			symbol = -1;
			i++;
		}

		while (i < arrays.length && arrays[i] >= 48 && arrays[i] <= 57) {
			atoi = atoi * 10 + (arrays[i] - 48);
			if (atoi > Integer.MAX_VALUE) {
				break;
			}
			i++;
		}

		atoi = symbol * atoi;
		if (atoi > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		} else if (atoi < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		} else {
			return (int) atoi;
		}
	}
}
