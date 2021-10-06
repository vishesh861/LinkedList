package arrays;

import java.util.HashMap;

public class CountSubarrayWithGivenSum {
// {2,3,9,5,3,4.1}
    public void count(int[] arr, int sum) {

        int sum1=0, count=0;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<arr.length;i++) {
            sum1 += arr[i];
            if (sum1 == sum) {
                count++;
            }
            if (map.containsKey(sum1-sum)) {
                count = count + map.get(sum1-sum);
            }
            if (!map.containsKey(sum1)) {
                map.put(sum1, 1);
            } else {
                map.put(sum1, map.get(sum1) + 1);
            }
        }

        System.out.println(count);
    }
}
