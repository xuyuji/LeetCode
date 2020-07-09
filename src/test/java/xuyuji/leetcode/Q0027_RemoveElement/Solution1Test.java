package xuyuji.leetcode.Q0027_RemoveElement;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class Solution1Test {

    private Solution1 solution;

    @Before
    public void setup() {
        solution = new Solution1();
    }

    @Test
    public void testRemoveElement1() {
        int[] nums = new int[] {3, 2, 2, 3};
        int len = solution.removeElement(nums, 3);

        assertEquals(2, len);
        assertArrayEquals(new int[] {2, 2}, Arrays.copyOfRange(nums, 0, len));
    }
}
