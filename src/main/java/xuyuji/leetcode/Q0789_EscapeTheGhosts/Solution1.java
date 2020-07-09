package xuyuji.leetcode.Q0789_EscapeTheGhosts;

public class Solution1 {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int distance = abs(target[0]) + abs(target[1]);
        for (int[] ghost : ghosts) {
            if (distance >= (abs(ghost[0] - target[0]) + abs(ghost[1] - target[1]))) {
                return false;
            }
        }
        return true;
    }

    private int abs(int num) {
        return num >= 0 ? num : -1 * num;
    }
}
