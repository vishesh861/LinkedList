package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class MinSwapsToMakeArraySorted {

    public void min(int[] arr, int n) {

        int[] temp = Arrays.copyOfRange(arr, 0, n);
        Arrays.sort(temp);
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int result = 0;
        for(int i=0; i<n; i++) {
            map.put(arr[i], i);
        }
        for (int i=0; i<n; i++) {

            if (arr[i] != temp[i]) {
                result++;
                int a = arr[i];
                swap(arr, i, map.get(temp[i]));

                map.put(a, map.get(temp[i]));
                map.put(temp[i], i);
            }
        }
        System.out.println(result);
    }

    private void swap(int[] arr, int i, Integer integer) {
        int c = arr[i];
        arr[i] = arr[integer];
        arr[integer] = c;
    }
}
