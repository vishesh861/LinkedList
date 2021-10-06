package arrays;

/*Input: candidates = [2,3,6,7], target = 7
        Output: [[2,2,3],[7]]
        Explanation:
        2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
        7 is a candidate, and 7 = 7.
        These are the only two combinations.*/

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combination(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(arr, 0, target, new ArrayList<Integer>(), result);
        return result;
    }

    private void backtrack(int[] a, int start, int target, List<Integer> list, List<List<Integer>> result) {

        if (target < 0) {
            return;
        }

        if (target == 0) {
            result.add(new ArrayList<Integer>(list));
        }

        for (int i=start; i<a.length; i++) {

            list.add(a[i]);

            backtrack(a, i, target-a[i], list, result);

            list.remove(list.size()-1);
        }
     }
}
