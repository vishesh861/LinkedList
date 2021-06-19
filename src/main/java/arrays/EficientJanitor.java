package arrays;

import java.util.Arrays;
import java.util.List;

public class EficientJanitor {
/*list.add(1.00f);
        list.add(1.99f);
        list.add(2.5f);
        list.add(1.5f);
        list.add(1.01f);

        we are given list of values and maximum limit
        find minimum how many rounds i have to take to pick sum of values which are equal and less
        than the limit?
*
*
* */
    public void demo(List<Float> list) {
        float limit = 3.0f;
        Float[] arr = new Float[list.size()];
        arr = list.toArray(arr);
        int n = arr.length;
        Arrays.sort(arr);

        boolean[] check = new boolean[n];
        int count = 0;
        for (int i = n-1; i >= 0; i--) {
            if (check[i])
                continue;
            check[i] = true;
            count++;

            float remain = limit - arr[i];
            for (int j = i-1; j >= 0; j--) {
                if (!check[j] && arr[j] <= remain) {
                    remain = remain - arr[j];
                    check[j] = true;
                    // break;  // add this if  maximum items = 2 // come back to the problem https://leetcode.com/problems/boats-to-save-people/
                }
            }
        }

        System.out.println(count);
    }

}
