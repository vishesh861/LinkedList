package arrays;

import java.util.ArrayList;
import java.util.TreeSet;

public class CeilingOnLeft {

    public void ceiling(int[] arr) {

        int n = arr.length;
        TreeSet<Integer> set = new TreeSet<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>(n);

        for (int i = 0; i < n; i++) {
            Integer greater = set.ceiling(arr[i]);
            if (greater == null)
                result.add(-1);
            else
                result.add(greater);
            set.add(arr[i]);
        }

        for (int i = 0; i < n; i++)
            System.out.print(result.get(i) + " ");
    }
}
