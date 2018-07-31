package xuyuji.leetcode.Q0387_FirstUniqueCharacterInAString;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Solution1Test {

	private Solution1 solution;

	@Before
	public void setup() {
		solution = new Solution1();
	}

	@Test
	public void testFirstUniqChar1() {
		assertEquals(0, solution.firstUniqChar("leetcode"));
	}

	@Test
	public void testFirstUniqChar2() {
		assertEquals(2, solution.firstUniqChar("loveleetcode"));
	}
}
