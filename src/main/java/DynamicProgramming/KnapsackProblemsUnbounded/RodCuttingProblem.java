package DynamicProgramming.KnapsackProblemsUnbounded;

public class RodCuttingProblem {

    public void max(int[] len, int[] price, int n) {

       int[][] mat = new int[n+1][n+1];

       for (int i=1; i<n+1; i++) {
           for (int j=1; j<n+1; j++) {

               if (len[i-1] <= j) {
                   mat[i][j] = Integer.max(price[i-1] + mat[i][j-len[i-1]], mat[i-1][j]);
               } else {
                   mat[i][j] = mat[i-1][j];
               }
           }
       }

        System.out.println(mat[n][n]);
    }
}
