package BST;

import java.util.ArrayList;

public class CeilingOnLeft {

    public void ceiling(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            int max = Integer.MIN_VALUE, flag = 0;
            for (int j=0; j<i; j++) {

                if (arr[j] < arr[i]) {
                    flag = 1;
                    max = Integer.max(max, arr[j]);
                }
            }

            if (flag == 0) {
                list.add(-1);
            } else {
                list.add(max);
            }
        }

        list.forEach(System.out::println);
    }
}
