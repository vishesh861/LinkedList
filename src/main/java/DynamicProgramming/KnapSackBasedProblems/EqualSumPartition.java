package DynamicProgramming.KnapSackBasedProblems;

public class EqualSumPartition {

    public boolean equalSum(int[] arr, int n) {
        int sum = 0, partitionSum = 0;
        for (int i=0; i<n; i++) {
            sum += arr[i];
        }

        if (sum % 2 != 0) {
            return false;
        } else {
            partitionSum = sum / 2;
        }

        boolean[][] t = new boolean[n+1][partitionSum+1];

        for (int i=0; i<n+1; i++) {
            for (int j=0; j<partitionSum+1; j++) {

                if (i == 0) {
                    t[i][j] = false;
                } else if (j == 0) {
                    t[i][j] = true;
                } else if (arr[i-1] <= j) {
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                } else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][partitionSum];
    }
}
