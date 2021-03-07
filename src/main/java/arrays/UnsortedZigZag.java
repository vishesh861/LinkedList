package arrays;

public class UnsortedZigZag {

    public void zigzag(int[] arr) {

        boolean flag = true;

        for (int i=0; i<arr.length-1; i++) {

            if ((flag == true && arr[i] > arr[i+1]) || flag == false && arr[i] < arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
            }
            flag = !flag;
        }

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
