package xuyuji.leetcode.twosum;

import org.junit.Test;
import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void testTwoSum(){
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = new TwoSum().twoSum(nums, target);
        assertArrayEquals(result, new int[]{0, 1});
    }
}
