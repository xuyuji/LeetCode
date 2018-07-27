package xuyuji.leetcode.Q0066_PlusOne;

public class Solution1 {
	public int[] plusOne(int[] digits) {
		if (digits == null || digits.length == 0) {
			return new int[] {};
		}

		int len = digits.length;
		int[] result = new int[len];

		int i = len - 1;
		int n = digits[i] + 1;
		result[i] = n % 10;
		int carry = n / 10;
		i--;

		while (carry > 0 && i >= 0) {
			n = digits[i] + carry;
			carry = n / 10;
			result[i] = n % 10;
			i--;
		}
		while (i >= 0) {
			result[i] = digits[i];
			i--;
		}

		if (carry > 0) {
			int[] newResult = new int[len + 1];
			System.arraycopy(result, 0, newResult, 1, len);
			newResult[0] = carry;
			return newResult;
		} else {
			return result;
		}
	}
}
