package arrays;

public class MaxSumInAnArray {

    public void max(int[] arr) {

        int sum = arr[0];
        int result = arr[0];

        for (int i=1; i<arr.length; i++) {

            sum = Math.max(arr[i], sum + arr[i]);
            result = Math.max(result, sum);
        }

        System.out.println(result);
    }
}
