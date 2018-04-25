package xuyuji.leetcode.Q0006_ZigZagConversion;

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
	public void testConvert1() {
		assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
	}

	@Test
	public void testConvert2() {
		assertEquals("PINALSIGYAHRPI", solution.convert("PAYPALISHIRING", 4));
	}

}
