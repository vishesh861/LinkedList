package DynamicProgramming.MoreDPProblems;

import java.util.Arrays;

public class MinPallindromePartitioning {

    public static int[][] arr = new int[2000][2000];
    public int minCut(String s) {
        for (int[] row : arr) {
            Arrays.fill(row, -1);
        }
        int i = 0;
        int j= s.length()-1;
        return test(s, i, j);
    }

    private int test(String s, int i, int j) {
        if (i >= j) {
            return 0;
        }

        if (isPallindrome(s, i, j)) {
            return 0;
        }

        if (arr[i][j] != -1) {
            return arr[i][j];
        }

        int min = Integer.MAX_VALUE;
        int left=0,right=0;
        for (int k=i; k<=j-1; k++) {

            if (arr[i][k] != -1) {
                left = arr[i][k];
            } else {
                left = test(s, i, k);
                arr[i][k] = left;
            }

            if (arr[k+1][j] != -1) {
                right = arr[k+1][j];
            } else {
                right = test(s, k+1, j);
                arr[k+1][j] = right;
            }

            int temp = 1 + left + right;
            min = Integer.min(min, temp);
        }

        return arr[i][j] = min;

    }

    private boolean isPallindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
