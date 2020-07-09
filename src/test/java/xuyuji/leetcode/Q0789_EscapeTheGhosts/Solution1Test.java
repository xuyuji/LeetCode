package xuyuji.leetcode.Q0789_EscapeTheGhosts;

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
    public void testEscapeGhosts1() {
        assertEquals(true, solution.escapeGhosts(
                new int[][] {{1, 0}, {0, 3}}, new int[] {0, 1}));
    }

    
    @Test
    public void testEscapeGhosts2() {
        assertEquals(false, solution.escapeGhosts(
                new int[][] {{1, 0}}, new int[] {2, 0}));
    }

    
    @Test
    public void testEscapeGhosts3() {
        assertEquals(false, solution.escapeGhosts(
                new int[][] {{2, 0}}, new int[] {1, 0}));
    }

    
    @Test
    public void testEscapeGhosts4() {
        assertEquals(false, solution.escapeGhosts(
                new int[][] {{5, 0}, {-10, -2}, {0, -5}, {-2, -2}, {-7, 1}}, new int[] {7, 7}));
    }

    @Test
    public void testEscapeGhosts5() {
        assertEquals(false, solution.escapeGhosts(
                new int[][] {{1, 8}, {-9, 0}, {-7, -6}, {4, 3}, {1, 3}}, new int[] {6, -9}));
    }
}
