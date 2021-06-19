package DynamicProgramming.LCS;

public class LongestRepeatingSubsequence {

    public void longest (String s1) {

        String s2 = s1;
        int m = s1.length(), n = s2.length();

        int[][] mat = new int[m+1][n+1];

        for (int i=0; i<m+1; i++) {
            for (int j=0; j<n+1; j++) {

                if (i == 0 || j== 0) {
                    mat[i][j] = 0;
                } else if (s1.charAt(i-1) == s2.charAt(j-1) && i != j) {
                    mat[i][j] = 1 + mat[i-1][j-1];
                } else {
                    mat[i][j] = Integer.max(mat[i-1][j], mat[i][j-1]);
                }
            }
        }

        System.out.println(mat[m][n]);
    }
}
