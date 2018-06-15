package xuyuji.leetcode.Q0012_IntegertoRoman;

import java.io.IOException;

public class Solution2 {

	private int[] carryNums = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
	private String[] carryIndicators = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };

	public String intToRoman(int num) {
		StringBuilder sb = new StringBuilder();
		for (int i = carryNums.length - 1; i >= 0; i--) {
			int carryNum = carryNums[i];
			String carryIndicator = carryIndicators[i];
			if (num >= carryNum) {
				int count = num / carryNum;
				num = num % carryNum;
				for (int j = 0; j < count; j++) {
					sb.append(carryIndicator);
				}
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) throws IOException {
		Solution2 solution = new Solution2();
		System.out.println(solution.intToRoman(555));
		System.out.println(solution.intToRoman(58));
		System.out.println(solution.intToRoman(1994));
	}
}
