package arrays;

public class FindElementInSortedRotatedArray {

    public int findElementInSortedRotatedArray (int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
           return mid;
        }

        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return findElementInSortedRotatedArray(arr, target, start, mid-1);
            } else {
                return findElementInSortedRotatedArray(arr, target, mid+1, end);
            }
        } else {
            if (target >= arr[mid] && target <= arr[end]) {
                return findElementInSortedRotatedArray(arr, target, mid+1, end);
            } else {
                return findElementInSortedRotatedArray(arr, target, start, mid-1);
            }
        }
    }
}
