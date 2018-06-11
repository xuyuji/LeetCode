package xuyuji.leetcode.Q0848_ShiftingLetters;

public class Solution1 {

	private static char A = 'a';

	public String shiftingLetters(String S, int[] shifts) {
		if (shifts.length == 0) {
			return S;
		}

		char[] letters = S.toCharArray();
		char[] shiftingLetters = new char[letters.length];
		int shift = 0;
		for (int i = shifts.length - 1; i >= 0; i--) {
			shiftingLetters[i] = shift(letters[i], shift += shifts[i] % 52);
		}

		return new String(shiftingLetters);
	}

	private char shift(char c, int i) {
		return (char) (A + (c + i - A) % 26);
	}

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		System.out.println(s.shiftingLetters("abc", new int[] { 3, 5, 9 }));
		System.out.println(s.shiftingLetters("mkgfzkkuxownxvfvxasy",
				new int[] { 505870226, 437526072, 266740649, 224336793, 532917782, 311122363, 567754492, 595798950,
						81520022, 684110326, 137742843, 275267355, 856903962, 148291585, 919054234, 467541837,
						622939912, 116899933, 983296461, 536563513 }));
	}
}
