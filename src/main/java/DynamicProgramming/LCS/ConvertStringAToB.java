package DynamicProgramming.LCS;

// Ques: Minimum number of insertion and deletion for converting String A to String B??
public class ConvertStringAToB {

    public void min(String s1, String s2, int m, int n) {

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

        //Min Deletion
        System.out.println(s1.length() - mat[m][n]);
        //Min Insertion
        System.out.println(s2.length() - mat[m][n]);


    }
}
