package xuyuji.leetcode.Q0121_BestTimetoBuyandSellStock;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	private Solution1 solution;

	@Before
	public void setup() {
		solution = new Solution1();
	}

	@Test
	public void testMaxProfit1() {
		assertEquals(5, solution.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
	}

	@Test
	public void testMaxProfit2() {
		assertEquals(0, solution.maxProfit(new int[] { 7, 6, 4, 3, 1 }));
	}
}
