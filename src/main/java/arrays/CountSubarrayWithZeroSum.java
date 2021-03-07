package arrays;

import java.util.HashMap;

public class CountSubarrayWithZeroSum {

    public int findSubarray(int[] arr)
    {
        //Your code here
       HashMap<Integer,Integer> map = new HashMap<>();
       int count = 0, sum = 0;

       for (int i=0; i<arr.length; i++) {

           sum += arr[i];

           if (sum == 0) {
               count++;
           }

           if (map.containsKey(sum)) {
               count += map.get(sum);
               map.put(sum, map.get(sum) + 1);
           } else {
               map.put(sum, 1);
           }

       }

       return count;
    }
}
