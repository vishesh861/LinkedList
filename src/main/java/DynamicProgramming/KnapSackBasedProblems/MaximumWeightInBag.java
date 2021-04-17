package DynamicProgramming.KnapSackBasedProblems;

//import java.util.Arrays;

import java.util.Arrays;

public class MaximumWeightInBag {


    public int max_weight(int[] wt, int[] val, int w, int n) {
        int[][] mat = new int[n+1][w+1];

        for (int i = 1; i<n+1; i++) {
            for (int j = 1; j<w+1; j++) {

                 if (wt[i - 1] <= j) {
                    mat[i][j] = Integer.max(val[i - 1] + mat[i - 1][j - wt[i - 1]],
                            mat[i - 1][j]);
                } else  {
                    mat[i][j] = mat[i - 1][j];
                }
            }
        }

        return mat[n][w];

    }
}
