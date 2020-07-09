package xuyuji.leetcode.Q0016_3SumClosest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

public class Solution1Test {

    private Solution1 solution;

    @Before
    public void setup() {
        solution = new Solution1();
    }

    @Test
    public void threeSumClosest1() {
        int result = solution.threeSumClosest(new int[] {-1, 2, 1, -4}, 1);
        assertNotNull(result);
        assertEquals(2, result);
    }

    @Test
    public void threeSumClosest2() {
        int result = solution.threeSumClosest(new int[] {0, 2, 1, -3}, 1);
        assertNotNull(result);
        assertEquals(0, result);
    }
}
