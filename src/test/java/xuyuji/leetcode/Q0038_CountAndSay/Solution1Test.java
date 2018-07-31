package xuyuji.leetcode.Q0038_CountAndSay;

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
	public void testCountAndSay1() {
		assertEquals("1", solution.countAndSay(1));
	}

	@Test
	public void testCountAndSay2() {
		assertEquals("11", solution.countAndSay(2));
	}

	@Test
	public void testCountAndSay3() {
		assertEquals("21", solution.countAndSay(3));
	}

	@Test
	public void testCountAndSay4() {
		assertEquals("1211", solution.countAndSay(4));
	}

	@Test
	public void testCountAndSay5() {
		assertEquals("111221", solution.countAndSay(5));
	}

	@Test
	public void testCountAndSay6() {
		assertEquals("312211", solution.countAndSay(6));
	}

	@Test
	public void testCountAndSay7() {
		assertEquals("13112221", solution.countAndSay(7));
	}

	@Test
	public void testCountAndSay8() {
		assertEquals("1113213211", solution.countAndSay(8));
	}
}
