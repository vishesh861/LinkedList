package DynamicProgramming.LCS;

public class LongestRepeatingSubstring {

    public void longest (String str) {

        int n = str.length();
        int mat[][] = new int[n + 1][n + 1];

        String res = ""; // To store result
        int res_length = 0; // To store length of result

        // building table in bottom-up manner
        int i, index = 0;
        for (i = 1; i < n+1; i++) {
            for (int j = i + 1; j < n+1; j++) {
                // (j-i) > LCSRe[i-1][j-1] to remove
                // overlapping
                if (str.charAt(i - 1) == str.charAt(j - 1)
                        && mat[i - 1][j - 1] < (j - i)) {
                    mat[i][j] = mat[i - 1][j - 1] + 1;

                    // updating maximum length of the
                    // substring and updating the finishing
                    // index of the suffix
                    if (mat[i][j] > res_length) {
                        res_length = mat[i][j];
                        index = Math.max(i, index);
                    }
                } else {
                    mat[i][j] = 0;
                }
            }
        }

        // If we have non-empty result, then insert all
        // characters from first character to last
        // character of String
        if (res_length > 0) {
            for (i = index - res_length + 1; i <= index; i++) {
                res += str.charAt(i - 1);
            }
        }

        System.out.println(res);
    }
}
