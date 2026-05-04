class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int left = 0;
        int right = left + 1;

        while (right < prices.length) {
            if (prices[left] > prices[right]) {
                left = right;
                right = left + 1;
            }
            else {
                profit = Math.max(profit, prices[right] - prices[left]);
                right++;
            }
        }
        return profit;
    }
}
