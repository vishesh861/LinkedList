package DynamicProgramming.KnapSackBasedProblems;

import java.util.Vector;

public class MinimumSubsetSumDifference {

    public int min(int[] arr, int n) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        boolean[][] b = new boolean[n+1][sum+1];

        b[0][0] = true;
        for (int i = 1; i <= sum; i++)
            b[0][i] = false;
        for (int i = 1; i <= n; i++)
            b[i][0] = true;

        for (int i=1; i<n+1; i++) {
            for (int j=1; j<sum+1; j++) {

                if (arr[i-1] <= j) {
                    b[i][j] = b[i-1][j-arr[i-1]] || b[i-1][j];
                } else {
                    b[i][j] = b[i-1][j];
                }
            }
        }

        int diff = Integer.MAX_VALUE;

        for (int j = sum / 2; j >= 0; j--)
        {
            // Find the
            if (b[n][j] == true)
            {
                diff = sum - 2 * j;
                break;
            }
        }
        return diff;
    }
}
