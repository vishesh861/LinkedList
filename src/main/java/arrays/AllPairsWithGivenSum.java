package arrays;

import java.util.HashMap;

public class AllPairsWithGivenSum {

    public void pair(int[] arr, int sum) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<arr.length; i++) {

            int diff = sum - arr[i];

            if (map.containsKey(diff)) {
                int count = map.get(diff);

                for (int j=0; j<count; j++) {
                    System.out.println(diff + "," + arr[i]);
                }
            }

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
    }
}
