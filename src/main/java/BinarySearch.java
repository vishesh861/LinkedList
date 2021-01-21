public class BinarySearch {

    public void search(int arr[], int size, int item) {

        int low = 0;
        int high = size - 1;
        int mid;

        for (int i=0; i<=size-1; i++) {

            mid = (low + high) / 2;
            if (item < mid) {
                high = mid - 1;
            }
            else if (item > mid) {
                low = mid + 1;
            }
            else {
                System.out.println("we found the number" +mid);
                break;
            }
        }
        System.out.println("Not found number" +item);
    }
}
