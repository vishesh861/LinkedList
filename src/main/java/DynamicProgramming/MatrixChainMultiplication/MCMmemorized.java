package DynamicProgramming.MatrixChainMultiplication;

import java.util.Arrays;

public class MCMmemorized {

    static int[][] mat = new int[100][100];

   static int mcm(int[] arr, int i, int j) {

       if (i == j) {
           return 0;
       }

       mat[i][j] = Integer.MAX_VALUE;

       for (int k=i; k<j; k++) {
           mat[i][j] = Math.min(mat[i][j], mcm(arr, i, k)
                   + mcm(arr, k + 1, j)
                   + arr[i - 1] * arr[k] * arr[j]);
       }

       return mat[i][j];
   }

  public static void main(String[] args) {

      int[] arr = {1,2,3,4};

      for (int[] row : mat) {
          Arrays.fill(row, -1);
      }

      int m = mcm(arr, 1, arr.length-1);
      System.out.println(m);
  }

}
