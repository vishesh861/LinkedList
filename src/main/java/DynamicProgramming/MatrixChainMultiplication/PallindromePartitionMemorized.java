package DynamicProgramming.MatrixChainMultiplication;

import java.util.Arrays;

public class PallindromePartitionMemorized {

    static int[][] mat = new int[100][100];

    public static int pallindromePartition(String str, int i, int j) {

        if (i >= j || isPallindrome(str, i, j)) {
            return 0;
        }

        if (mat[i][j] != -1) {
            return mat[i][j];
        }

        int min = Integer.MAX_VALUE;

        for (int k = i; k <= j - 1; k++) {
            int temp = 1 + pallindromePartition(str, i, k) + pallindromePartition(str, k + 1, j);
            min = Math.min(min, temp);
        }

        return mat[i][j] = min;


    }

    private static boolean isPallindrome(String str, int i, int j) {

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "geek";

        for (int[] row : mat) {
            Arrays.fill(row, -1);
        }

        int m = pallindromePartition(s, 0, s.length() - 1);
        System.out.println(m);
    }
}



