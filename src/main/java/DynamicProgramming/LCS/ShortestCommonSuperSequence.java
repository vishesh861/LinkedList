package DynamicProgramming.LCS;

public class ShortestCommonSuperSequence {

    public void shortest(String s1, String s2, int m, int n) {

        int[][] mat = new int[m+1][n+1];

        for (int i=0; i<m+1; i++) {
            for (int j=0; j<n+1; j++) {
                if (i == 0 || j == 0) {
                    mat[i][j] = 0;
                }
            }
        }

        for (int i=1; i<m+1; i++) {
            for (int j=1; j < n + 1; j++) {

                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    mat[i][j] = 1 + mat[i-1][j-1];
                } else {

                    mat[i][j] = Integer.max(mat[i-1][j], mat[i][j-1]);
                }
            }
        }

        int scs = m + n - mat[m][n];
        System.out.println(scs);
    }
}
