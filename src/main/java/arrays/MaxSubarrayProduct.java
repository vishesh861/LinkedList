package arrays;

public class MaxSubarrayProduct {

    public void max(int[] arr) {

        int[] maxArray = new int[arr.length];
        int[] minArray = new int[arr.length];
        int result = arr[0];
        maxArray[0] = arr[0];
        minArray[0] = arr[0];

        for (int i=1; i<arr.length; i++) {

            if (arr[i] > 0) {
                maxArray[i] = Math.max(arr[i], maxArray[i-1] * arr[i]);
                minArray[i] = Math.max(arr[i], minArray[i-1] * arr[i]);
            } else {
                maxArray[i] = Math.max(arr[i], minArray[i-1] * arr[i]);
                minArray[i] = Math.max(arr[i], maxArray[i-1] * arr[i]);
            }

            result = Math.max(result, maxArray[i]);
        }

        System.out.println(result);

    }
}
