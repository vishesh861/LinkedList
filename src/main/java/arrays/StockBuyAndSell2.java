package arrays;

public class StockBuyAndSell2 {

   // You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
   //On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
   // However, you can buy it then immediately sell it on the same day.
    public int maxProfit(int[] prices) {
        int max = 0;
        int start = prices[0];
        int len = prices.length;

        for(int i = 1;i<len; i++) {
            if(start < prices[i]) {
                max += prices[i] - start;
            }
            start = prices[i];
        }
        return max;
    }

}
