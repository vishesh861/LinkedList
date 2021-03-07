package arrays;

import java.util.HashMap;

/* Ques : WAP to find the given sum present in an unsorted array???
* */
public class SumInArray {

// {1,2,3,4,5,6,7} sum = 16
    public Boolean present(int[] arr, int sum) {
      /*  int curr_sum = arr[0], start = 0;
        for (int i=1; i<=arr.length; i++) {

            while (curr_sum > sum && start < i) {
                curr_sum -= arr[start];
                start++;
            }
            if (curr_sum == sum) {
                System.out.println(start + "," + i);
                return true;
            } else if (i < arr.length) {
                curr_sum += arr[i];
            }
        }

        return false;*/

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum1 = 0;

        for (int i=0; i<arr.length; i++) {
            sum1 += arr[i];
            if (sum1 == sum) {
                return true;
            }

            if (map.containsKey(sum1-sum)) {
                return true;
            }

            if (!map.containsKey(sum1)) {
                map.put(sum1, 1);
            } else {
                map.put(sum1, map.get(sum1) + 1);
            }
        }

        return false;
    }

}
