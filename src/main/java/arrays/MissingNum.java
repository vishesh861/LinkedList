package arrays;

import java.util.Arrays;

/* Ques : WAP to find the missing number in a consecutive integer array???
* */
public class MissingNum {

    public void missing(int[] arr) {

        int[] arr1 = new int[arr[arr.length-1] + 1];

        for (int i = 0; i < arr.length; i++) {
            arr1[arr[i]]++;
        }

        for (int i = 15; i < arr1.length; i++) {

            if (arr1[i] == 0) {
                System.out.println(i);
            }
        }
    }
}

