package arrays;

public class StockBuyAndSell3 {
  //  You are given an array prices where prices[i] is the price of a given stock on the ith day.
  //  Find the maximum profit you can achieve. You may complete at most two transactions.
    public int maxProfit(int[] prices) {
        int firstBuy = Integer.MIN_VALUE, firstSell = 0, secondBuy = Integer.MIN_VALUE, secondSell = 0;

        for (int price : prices) {
            firstBuy = Math.max(firstBuy, -price);
            firstSell = Math.max(firstSell, firstBuy + price);
            secondBuy = Math.max(secondBuy, firstSell - price);
            secondSell = Math.max(secondSell, secondBuy + price);
        }
        return secondSell;
    }
}
