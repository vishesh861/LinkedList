package DynamicProgramming.KnapsackProblemsUnbounded;

import java.util.Arrays;

public class CoinChangeMaximumWays {

    public void max(int[] arr, int sum, int n) {

        int[][] mat = new int[n+1][sum+1];

        for (int i=0; i<=sum; i++) {
            mat[0][i] = 0;
        }

        for (int i=0; i<=n; i++) {
            mat[i][0] = 1;
        }

        for (int i=1; i<n+1; i++) {
            for (int j=1; j<sum+1; j++) {

                if (arr[i-1] <= j) {
                    mat[i][j] = mat[i][j - arr[i-1]] + mat[i-1][j];
                } else {
                    mat[i][j] = mat[i-1][j];
                }
            }
        }

        System.out.println(mat[n][sum]);
    }
}
