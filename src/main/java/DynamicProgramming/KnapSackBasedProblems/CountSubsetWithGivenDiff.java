package DynamicProgramming.KnapSackBasedProblems;

public class CountSubsetWithGivenDiff {

    public void count(int[] arr, int diff) {

        int sum = 0;
        int n = arr.length;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        int s1 = (diff + sum) / 2;

        int[][] mat = new int[n+1][s1+1];

        mat[0][0] = 1;

        for (int i=1; i<=s1; i++) {
            mat[0][i] = 0;
        }

        for (int i=1; i<=n; i++) {
            mat[i][0] = 1;
        }

        for (int i=1; i<n+1; i++) {
            for (int j=1; j<s1+1; j++) {

                if (arr[i-1] <= j) {
                    mat[i][j] = mat[i-1][j-arr[i-1]] + mat[i-1][j];
                } else {
                    mat[i][j] = mat[i-1][j];
                }
            }
        }

        System.out.println(mat[n][s1]);
    }
}
