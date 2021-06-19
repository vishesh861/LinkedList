package DynamicProgramming.MatrixChainMultiplication;

public class MCMRecursive {

    public int mcm(int[] arr, int i, int j) {

        if (i >= j) {
            return 0;
        }

        int min = Integer.MAX_VALUE;

        for (int k=i; k<=j-1; k++) {

            int temp = mcm(arr, i, k) + mcm(arr, k+1, j) + arr[i-1] * arr[k] * arr[j];

            if (temp < min) {
                min = temp;
            }
        }

        return min;
    }
}
