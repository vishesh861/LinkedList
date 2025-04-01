package arrays;

//You are given an integer array prices where prices[i] is the price of a given stock on the ith day, and an integer k.
//Find the maximum profit you can achieve. You may complete at most k transactions: i.e. you may buy at most k times and sell at most k times.
public class StockBuyAndSell4 {

    public int maxProfit(int k, int[] arr) {
        int n = arr.length;
        if(n==0) {
            return 0;
        }

        if(k >= n/2) {
            int maxProfit = 0;
            for(int i=1; i<n; i++){
                if(arr[i] > arr[i-1]){
                    maxProfit += arr[i]-arr[i-1];
                }
            }
            return maxProfit;
        }

        int[] buy = new int[k+1];
        int[] sell = new int[k+1];

        for(int i=0; i<=k; i++) {
            buy[i]=Integer.MIN_VALUE;
        }

        for(int a : arr) {
            for(int j=1; j<=k; j++) {
                buy[j] = Math.max(buy[j], sell[j-1]-a);
                sell[j] = Math.max(sell[j], buy[j]+a);
            }
        }
        return sell[k];
    }

}
