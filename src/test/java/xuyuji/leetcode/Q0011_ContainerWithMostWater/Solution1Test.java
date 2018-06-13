package xuyuji.leetcode.Q0011_ContainerWithMostWater;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Solution1Test {

	private Solution1 solution;

	private int[] longArray;

	@Before
	public void setup() throws IOException {
		solution = new Solution1();
		initLongArray();
	}

	private void initLongArray() throws IOException {
		BufferedReader reader = new BufferedReader(
				new FileReader("src\\main\\resources\\xuyuji\\leetcode\\Q0011_ContainerWithMostWater\\data.txt"));

		List<Integer> list = new ArrayList<>();
		String line = null;
		while ((line = reader.readLine()) != null) {
			for (String numStr : line.split(",")) {
				list.add(Integer.parseInt(numStr));
			}
		}
		reader.close();

		longArray = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			longArray[i] = list.get(i);
		}
	}

	@Test
	public void testMaxArea1() {
		assertEquals(1, solution.maxArea(new int[] { 1, 1 }));
	}

	@Test(timeout = 2)
	public void testMaxArea2() {
		assertEquals(56250000, solution.maxArea(longArray));
	}

	@Test
	public void testMaxArea3() {
		assertEquals(4, solution.maxArea(new int[] { 2, 3, 2, 1 }));
	}
}
