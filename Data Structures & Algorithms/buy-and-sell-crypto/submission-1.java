class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int maxProfit = 0;
        while(r < prices.length){
            if(prices[l] < prices[r]){
                int currProfit = prices[r] - prices[l];
                maxProfit = maxProfit < currProfit ? currProfit : maxProfit;
            }else{
                l = r;
            }
            r++;
        }
        return maxProfit;
    }
}
