package xuyuji.leetcode.Q0278_FirstBadVersion;

public class Solution1 {

	private int badVersion;

	public void setBadVersion(int version) {
		badVersion = version;
	}

	private boolean isBadVersion(int version) {
		return badVersion <= version;
	}

	public int firstBadVersion(int n) {
		int low = 1;
		int high = n;
		int mid;
		while (low < high) {
			mid = low + (high - low) / 2;
			if (isBadVersion(mid)) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}

		return low;
	}

}
