package DynamicProgramming.LCS;

public class LongestPallandromicSubstring {

    public void longest(String s1) {

        String s2 = "";

        for (int i=s1.length()-1; i>=0; i--) {
            s2 = s2 + s1.charAt(i);
        }

        int m = s1.length(), n = s2.length();

        int[][] mat = new int[m+1][n+1];

        int result = 0;

        for (int i=0; i<m+1; i++) {
            for (int j=0; j<n+1; j++) {

                if (i == 0 || j == 0) {
                    mat[i][j] = 0;
                } else if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    mat[i][j] = 1 + mat[i-1][j-1];
                    result = Integer.max(result, mat[i][j]);
                } else {
                    mat[i][j] = 0;
                }
            }
        }

        System.out.println(result);

    }
}
