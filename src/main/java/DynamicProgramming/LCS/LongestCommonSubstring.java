package DynamicProgramming.LCS;

public class LongestCommonSubstring {

    public void longest(String s1, String s2, int m, int n) {

        int[][] mat = new int[m+1][n+1];

        for (int i=0; i<m+1; i++) {
            for (int j=0; j<n+1; j++) {
                if (i == 0 || j == 0) {
                    mat[i][j] = 0;
                }
            }
        }

        int result = 0;
        for (int i=1; i<m+1; i++) {
            for (int j=1; j<n+1; j++) {

                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    mat[i][j] = 1 + mat[i - 1][j - 1];
                    result = Integer.max(result,
                            mat[i][j]);
                } else {
                    mat[i][j] = 0;
                }
            }
        }

        System.out.println(result);
    }
}
