package xuyuji.leetcode.Q0038_CountAndSay;

public class Solution1 {
	public String countAndSay(int n) {
		if (n <= 1) {
			return "1";
		} else {
			char[] array = countAndSay(n - 1).toCharArray();
			char c = array[0];
			int num = 1;
			StringBuffer sb = new StringBuffer();
			for (int i = 1; i < array.length; i++) {
				if (array[i] != c) {
					sb.append(num).append(c);
					c = array[i];
					num = 1;
				} else {
					num++;
				}
			}
			sb.append(num).append(c);
			return sb.toString();
		}
	}
}
