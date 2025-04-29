package arrays;

public class CheckSubarrayWithGivenSum {

    public Boolean check(int[] arr, int k) {
        int sum=0,start=0;
        for (int i=0; i<=arr.length; i++) {

            while (sum > k && start < i - 1) {
                sum -= arr[start];
                start++;
            }

            if (sum == k) {
                System.out.println(start + " " + (i-1));
                return true;
            } else if (i < arr.length){
                sum += arr[i];
            }
        }

        return false;
    }
}
