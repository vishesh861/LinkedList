package DynamicProgramming.LCS;

public class ShortestCommonSuperSequencePrint {

    public void shortest(String s1, String s2, int m, int n) {

        int[][] mat = new int[m + 1][n + 1];


        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {

                if (i == 0) {
                    mat[i][j] = j;
                } else if (j == 0) {
                    mat[i][j] = i;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    mat[i][j] = 1 + mat[i - 1][j - 1];
                } else {
                    mat[i][j] = 1 + Math.min(mat[i - 1][j], mat[i][j - 1]);
                }
            }
        }

        String str = "";
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                str += (s1.charAt(i - 1));
                i--;
                j--;
            } else if (mat[i - 1][j] > mat[i][j - 1]) {
                str += (s2.charAt(j - 1));
                j--;
            } else {
                str += (s1.charAt(i - 1));
                i--;
            }
        }

        while (i > 0) {
            str += (s1.charAt(i - 1));
            i--;
        }

        while (j > 0) {
            str += (s2.charAt(j - 1));
            j--;
        }

        for (int l=str.length()-1; l>=0; l--) {
            System.out.print(str.charAt(l));
        }
    }
}
