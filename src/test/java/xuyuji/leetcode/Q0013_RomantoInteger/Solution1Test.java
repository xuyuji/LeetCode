package xuyuji.leetcode.Q0013_RomantoInteger;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class Solution1Test {

	private Solution1 solution;

	@Before
	public void setup() throws IOException {
		solution = new Solution1();
	}

	@Test
	public void testRomanToInt1() {
		assertEquals(3, solution.romanToInt("III"));
	}

	@Test
	public void testRomanToInt2() {
		assertEquals(4, solution.romanToInt("IV"));
	}

	@Test
	public void testRomanToInt3() {
		assertEquals(9, solution.romanToInt("IX"));
	}

	@Test
	public void testRomanToInt4() {
		assertEquals(58, solution.romanToInt("LVIII"));
	}

	@Test
	public void testRomanToInt5() {
		assertEquals(1994, solution.romanToInt("MCMXCIV"));
	}

}
