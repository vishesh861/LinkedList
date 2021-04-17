package DynamicProgramming.KnapSackBasedProblems;

public class SubsetSumProblem {

    public boolean subsetSum(int[] arr, int sum, int n) {

        boolean[][] t = new boolean[n+1][sum+1];

        t[0][0] = true;
        for (int i = 1; i <= sum; i++)
            t[0][i] = false;
        for (int i = 1; i <= n; i++)
            t[i][0] = true;

        for (int i=1; i<n+1; i++) {
            for (int j=1; j<sum+1; j++) {

                if (arr[i-1] <= j) {
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                } else {
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][sum];

    }
}
