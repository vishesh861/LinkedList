package arrays;

public class FindElementInAlmostSortedArray {

    public int find(int[] arr,int l, int h, int target) {

        while (l <= h) {

            int mid = l + (h-l) / 2;

            if (arr[mid] == target) {
                return mid;
            } if (mid > l && arr[mid-1] == target) {
                return mid-1;
            } if (mid < h && arr[mid+1] == target) {
                return mid +1;
            }

            if (arr[mid] > target) {
                return find(arr, l, mid-2,target);
            }

            return find(arr, mid+2,h,target);
        }

        return -1;
    }

    public int binary(int[] arr, int target) {

        int l = 0;
        int h = arr.length-1;

        int result = find(arr,l,h,target);
        return result;
    }
    
}
