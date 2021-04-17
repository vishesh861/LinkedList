package DynamicProgramming.KnapsackProblemsUnbounded;

public class CoinChangeMinimumCoins {

    public void min(int[] arr, int sum, int n) {

        int[][] mat = new int[n+1][sum+1];

        for (int i=1; i<=n; i++) {
            mat[i][0] = 0;
        }

        for (int i=0; i<=sum; i++) {
            mat[0][i] = Integer.MAX_VALUE-1;
        }

        for (int i=1; i<=sum; i++) {

            if (i % arr[0] == 0) {
                mat[1][i] = i/arr[0];
            } else {
                mat[1][i] = Integer.MAX_VALUE-1;
            }
        }

        for (int i=2; i<n+1; i++) {
            for (int j=1; j<sum+1; j++) {

                if (arr[i-1] <= j) {
                    mat[i][j] = Integer.min(mat[i][j-arr[i-1]] + 1, mat[i-1][j]);
                } else {
                    mat[i][j] = mat[i-1][j];
                }
            }
        }

        System.out.println(mat[n][sum]);
    }
}
