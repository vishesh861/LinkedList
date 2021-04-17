package arrays;

public class Arr0s1s {

    public void arrange(int[] arr) {

        int i=0,j=arr.length-1;

        while (i<j) {

            if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            } else if (arr[i] == 0 && arr[j] == 1) {
                i++;
                j--;
            } else if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            }
        }


        for (int a : arr) {
            System.out.print(a + " ");
        }


    }
}
