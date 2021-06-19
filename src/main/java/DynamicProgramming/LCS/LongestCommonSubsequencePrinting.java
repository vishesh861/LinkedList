package DynamicProgramming.LCS;

public class LongestCommonSubsequencePrinting {

    public void longest(String s1, String s2, int m, int n) {

        int[][] mat = new int[m+1][n+1];

        for (int i=0; i<m+1; i++) {
            for (int j=0; j<n+1; j++) {

                if (i == 0 || j == 0) {
                    mat[i][j] = 0;
                } else if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    mat[i][j] = 1 + mat[i-1][j-1];
                } else {
                    mat[i][j] = Integer.max(mat[i-1][j], mat[i][j-1]);
                }
            }
        }

        int i = m, j = n;
        String str = "";

        while (i > 0 && j > 0) {

            if (s1.charAt(i-1) == s2.charAt(j-1)) {
                str = str + s1.charAt(i-1);
                i--;
                j--;
            } else {
                if (mat[i-1][j] > mat[i][j-1]) {
                    j--;
                } else {
                    i--;
                }
            }
        }

       for (int l=str.length()-1; l>=0; l--) {
           System.out.print(str.charAt(l));
       }

    }
}
