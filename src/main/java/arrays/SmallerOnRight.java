package arrays;

import java.util.TreeSet;

public class SmallerOnRight {

    public void smaller(int[] arr) {
        int count = 0;

        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i=arr.length-1; i>=0; i--) {
            set.add(arr[i]);
            count = Math.max(set.headSet(arr[i]).size(), count);
        }

        System.out.println(count);
    }
}
