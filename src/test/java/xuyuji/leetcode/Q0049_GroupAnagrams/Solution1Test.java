package xuyuji.leetcode.Q0049_GroupAnagrams;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import xuyuji.leetcode.common.FileStrData;

public class Solution1Test {

	private Solution1 solution;

	@Before
	public void setup() {
		solution = new Solution1();
	}

	@Test
	public void testGroupAnagrams1() {
		List<List<String>> list = solution.groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" });
		assertNotNull(list);

		for (List<String> subList : list) {
			assertNotNull(subList);
			Collections.sort(subList);
			switch (subList.size()) {
			case 1:
				assertArrayEquals(new String[] { "bat" }, subList.toArray(new String[] {}));
				break;
			case 2:
				assertArrayEquals(new String[] { "nat", "tan" }, subList.toArray(new String[] {}));
				break;
			case 3:
				assertArrayEquals(new String[] { "ate", "eat", "tea" }, subList.toArray(new String[] {}));
				break;
			default:
				break;
			}
		}
	}

	@Test(timeout = 30)
	public void testGroupAnagrams2() {
		List<List<String>> list = solution.groupAnagrams(FileStrData
				.readArray("src\\\\main\\\\resources\\\\xuyuji\\\\leetcode\\\\Q0049_GroupAnagrams\\\\data.txt"));
		assertNotNull(list);
		assertEquals(9869, list.size());
	}
}
