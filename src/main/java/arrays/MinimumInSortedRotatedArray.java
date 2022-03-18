package arrays;

import java.util.List;

public class MinimumInSortedRotatedArray {

    public int findMin(int[] arr) {

        int low = 0, high = arr.length-1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else if (arr[mid] < arr[low]) {
                high = mid;
                low++;
            } else {
                high--;
            }
        }

        return arr[low];
    }
}
