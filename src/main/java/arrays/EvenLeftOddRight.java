package arrays;

public class EvenLeftOddRight {

    public void evenodd(int[] arr) {
        int k=0,j=arr.length-1;
        for (int i=0; i<arr.length; i++) {


            while (arr[k] % 2 == 0) {
                k++;
            }

            while (arr[j] % 2 == 1) {
                j--;
            }

            if (k<j) {
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
            }
        }

        for (int a : arr) {
            System.out.print(a);
        }
    }
}
