package arrays;

import trees.Inorder;

public class SecondMax {

    public void second(int[] arr) {

        int max = Integer.MIN_VALUE, secondMax = 0;
        for (int i=0; i<arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println(secondMax);
    }
}
