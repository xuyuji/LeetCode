package xuyuji.leetcode.Q0013_RomantoInteger;

import java.io.IOException;

public class Solution1 {
	public int romanToInt(String s) {
		int num = 0;

		char[] cArray = s.toCharArray();
		for (int i = 0; i < cArray.length; i++) {
			switch (cArray[i]) {
			case 'I':
				if (i + 1 < cArray.length) {
					if (cArray[i + 1] == 'V') {
						num += 4;
						i++;
					} else if (cArray[i + 1] == 'X') {
						num += 9;
						i++;
					} else {
						num += 1;
					}
				} else {
					num += 1;
				}
				break;
			case 'V':
				num += 5;
				break;
			case 'X':
				if (i + 1 < cArray.length) {
					if (cArray[i + 1] == 'L') {
						num += 40;
						i++;
					} else if (cArray[i + 1] == 'C') {
						num += 90;
						i++;
					} else {
						num += 10;
					}

				} else {
					num += 10;
				}
				break;
			case 'L':
				num += 50;
				break;
			case 'C':
				if (i + 1 < cArray.length) {
					if (cArray[i + 1] == 'D') {
						num += 400;
						i++;
					} else if (cArray[i + 1] == 'M') {
						num += 900;
						i++;
					} else {
						num += 100;
					}
				} else {
					num += 100;
				}
				break;
			case 'D':
				num += 500;
				break;
			case 'M':
				num += 1000;
				break;
			default:
				return 0;
			}
		}

		return num;
	}

	public static void main(String[] args) throws IOException {
		Solution1 solution = new Solution1();
		System.out.println(solution.romanToInt("MCMXCIV"));
	}
}
