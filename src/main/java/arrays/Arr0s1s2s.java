package arrays;

public class Arr0s1s2s {

    public void sort(int[] arr) {

        int end=arr.length-1, start = 0, mid = 0, piviot = 1;

        while (mid <= end) {

            if (arr[mid] < piviot) {
                swap(arr, start, mid);
                start++;
                mid++;
            } else if (arr[mid] > piviot) {
                swap(arr, mid, end);
                end--;
            } else {
                mid++;
            }
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    private void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
