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

    public static void main(String[] args) {
        System.out.println(new Solution1().escapeGhosts(
                new int[][] {{5, 0}, {-10, -2}, {0, -5}, {-2, -2}, {-7, 1}}, new int[] {7, 7}));
        System.out.println(new Solution1().escapeGhosts(
                new int[][] {{1, 8}, {-9, 0}, {-7, -6}, {4, 3}, {1, 3}}, new int[] {6, -9}));
    }
}
