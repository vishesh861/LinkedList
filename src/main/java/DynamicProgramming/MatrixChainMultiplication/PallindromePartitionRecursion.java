package DynamicProgramming.MatrixChainMultiplication;

public class PallindromePartitionRecursion {

    public int pallindromePartition(String str, int i, int j) {

        if (i >= j) {
            return 0;
        }

        if (isPallindrome(str, i, j)) {
            return 0;
        }

        int min = Integer.MAX_VALUE;

        for (int k=i; k<=j-1; k++) {

            int temp = 1 + pallindromePartition(str, i, k) + pallindromePartition(str, k+1, j);

            min = Math.min(min, temp);
        }

        return min;
    }

    private boolean isPallindrome(String str, int i, int j) {

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
