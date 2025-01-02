package arrays;

public class RotateArrayAntiClockwise {

    void reduceArray(int[] arr, int n, int k) {
        if (k > n) {
            k = k % n;
        }
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }

    private void reverse(int[] arr, int i, int j) {

        while (i<j) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }

}
