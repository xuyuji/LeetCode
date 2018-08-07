package xuyuji.leetcode.Q0278_FirstBadVersion;

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
	public void testFirstBadVersion1() {
		solution.setBadVersion(4);
		assertEquals(4, solution.firstBadVersion(5));
	}

	@Test
	public void testFirstBadVersion2() {
		solution.setBadVersion(1);
		assertEquals(1, solution.firstBadVersion(1));
	}

	@Test
	public void testFirstBadVersion3() {
		solution.setBadVersion(1);
		assertEquals(1, solution.firstBadVersion(2));
	}

	@Test
	public void testFirstBadVersion4() {
		solution.setBadVersion(1702766719);
		assertEquals(1702766719, solution.firstBadVersion(2126753390));
	}
}
