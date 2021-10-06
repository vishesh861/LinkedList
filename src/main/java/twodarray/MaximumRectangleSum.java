package twodarray;

public class MaximumRectangleSum {

    public static int kadaneAlgorithm(int[] arr, int n) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        // Traverse the array.
        for (int currIndex = 0; currIndex < n; currIndex++) {
            sum += arr[currIndex];
            if (maxSum < sum) {
                maxSum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }

    public static void maxSumRectangle(int[][] arr, int n, int m) {
        int maxSum = Integer.MIN_VALUE;
        // Initialize a 1-D array.
        int[] temp = new int[n];
        // heck for all possible left and right boundaries.
        for (int left = 0; left < m; left++) {
            for (int i = 0; i < n; i++) {
                temp[i] = 0;
            }
            for (int right = left; right < m; right++) {
                for (int i = 0; i < n; i++) {
                    temp[i] += arr[i][right];
                }
                // Function to find maximum sum of sub array of array 'temp'.
                int sum = kadaneAlgorithm(temp, n);
                // Update 'maxSum'.
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println(maxSum);
    }
}
