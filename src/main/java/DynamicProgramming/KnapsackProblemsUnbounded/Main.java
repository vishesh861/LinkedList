package DynamicProgramming.KnapsackProblemsUnbounded;

public class Main {

    public static void main(String[] args) {

        /*RodCuttingProblem r = new RodCuttingProblem();
        int[] len = {1,2,3,4,5,6,7,8};
        int[] val = {1,5,8,9,10,17,17,20};
        int n = 8;
        r.max(len, val, n);*/

        /*CoinChangeMaximumWays c = new CoinChangeMaximumWays();
        int[] arr = {1,2,3};
        int sum = 5;
        int n = 3;
        c.max(arr, sum, n);*/

        CoinChangeMinimumCoins c = new CoinChangeMinimumCoins();
        int[] arr = {1,2,3};
        int sum = 5;
        int n = 3;
        c.min(arr, sum, n);
    }

}
