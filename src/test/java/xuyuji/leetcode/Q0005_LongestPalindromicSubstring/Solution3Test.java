package xuyuji.leetcode.Q0005_LongestPalindromicSubstring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Solution3Test {

	private Solution3 solution;

	@Before
	public void setup() {
		solution = new Solution3();
	}

	@Test
	public void testLongestPalindrome1() {
		assertThat(solution.longestPalindrome("babad")).isIn("bab", "aba");
	}

	@Test
	public void testLongestPalindrome2() {
		assertThat(solution.longestPalindrome("cbbd")).isEqualTo("bb");
	}

	@Test
	public void testLongestPalindrome3() {
		assertThat(solution.longestPalindrome("bb")).isEqualTo("bb");
	}

	@Test
	public void testLongestPalindrome4() {
		assertThat(solution.longestPalindrome("ccc")).isEqualTo("ccc");
	}

	@Test
	public void testLongestPalindrome5() {
		assertThat(solution.longestPalindrome(
				"abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababab"))
						.isIn("abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa",
								"bababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababab");
	}

}
