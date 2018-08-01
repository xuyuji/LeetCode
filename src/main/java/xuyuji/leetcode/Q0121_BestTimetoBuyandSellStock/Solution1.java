package xuyuji.leetcode.Q0121_BestTimetoBuyandSellStock;

public class Solution1 {
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length < 2) {
			return 0;
		}

		int[] diff = new int[prices.length - 1];
		for (int i = 0; i < prices.length - 1; i++) {
			diff[i] = prices[i + 1] - prices[i];
		}

		int maxProfit = 0;
		int profit = 0;
		for (int i = 0; i < diff.length; i++) {
			profit += diff[i];
			if (profit <= 0) {
				profit = 0;
			}
			if (profit > maxProfit) {
				maxProfit = profit;
			}
		}

		return maxProfit;
	}
}
