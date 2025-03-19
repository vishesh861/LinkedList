package arrays;

public class EvenLeftOddRight {

    public void evenodd(int[] arr) {
        int i=0,j=arr.length-1;

        while (i<j) {

            if (arr[i] % 2 == 1 && arr[j] % 2 == 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j--;
            } else if (arr[i] % 2 == 0 && arr[j] % 2 == 1) {
                i++;
                j--;
            } else if (arr[i] % 2 == 0) {
                i++;
            } else if (arr[j] % 2 == 1) {
                j--;
            }
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
