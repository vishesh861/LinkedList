package arrays;

import java.util.Arrays;

/* Ques : WAP to find the missing number in a consecutive integer array???
* */
public class MissingNum {

    public void missing(int[] arr) {
        int a = arr[arr.length-1];
        int[] arr1 = new int[a+1];
        Arrays.fill(arr1, 0);

        for (int i=0; i<arr.length; i++) {
            int b = arr[i];
            arr1[b]++;
        }

        for (int i = a - arr.length; i<arr1.length; i++) {
            if (arr1[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
