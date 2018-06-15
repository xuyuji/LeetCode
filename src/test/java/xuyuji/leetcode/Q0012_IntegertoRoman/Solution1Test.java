package xuyuji.leetcode.Q0012_IntegertoRoman;

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
	public void testIntToRoman1() {
		assertEquals("III", solution.intToRoman(3));
	}

	@Test
	public void testIntToRoman2() {
		assertEquals("IV", solution.intToRoman(4));
	}

	@Test
	public void testIntToRoman3() {
		assertEquals("IX", solution.intToRoman(9));
	}

	@Test
	public void testIntToRoman4() {
		assertEquals("LVIII", solution.intToRoman(58));
	}

	@Test
	public void testIntToRoman5() {
		assertEquals("MCMXCIV", solution.intToRoman(1994));
	}

}
