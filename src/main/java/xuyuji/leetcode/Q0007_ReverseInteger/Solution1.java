package xuyuji.leetcode.Q0007_ReverseInteger;

public class Solution1 {
	public int reverse(int x) {
		if (x < 10 && x > -10) {
			return x;
		}

		try {
			int result = 0;
			while (x != 0) {
				result = Math.addExact(Math.multiplyExact(result, 10), x % 10);
				x = x / 10;
			}
			return result;
		} catch (ArithmeticException e) {
			return 0;
		}
	}
}
