package arrays;

import java.util.HashMap;

public class CountSubarrayWithEqualZeroAndOne {

    public int countSubarrWithEqualZeroAndOne(int arr[], int N)
    {
        // add your code here
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count = 0, sum = 0;
        for (int i=0; i<N; i++) {

            if (arr[i]==0) {
                arr[i] = -1;
            }

            sum = sum + arr[i];

            if (sum == 0) {
                count++;
            }

            if (map.containsKey(sum)) {
                count += map.get(sum);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, 1);
            } else {
                map.put(sum, map.get(sum) + 1);
            }

        }

        return count;

    }
}
