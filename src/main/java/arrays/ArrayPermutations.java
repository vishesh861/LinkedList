package arrays;

import java.util.*;

/*
* Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
* */

public class ArrayPermutations {
    public void permute(LinkedList<List<Integer>> res, int[] num, int left, int right) {
        if (left == right) {
            LinkedList<Integer> list = new LinkedList<>();
            for (int a : num)
                list.add(a);
            res.add(list);
        }
        else {
            for (int i = left; i <= right; i++) {
                int[] swapped = swap(num, left, i);
                permute(res, swapped, left + 1, right);
            }
        }
    }
    public int[] swap(int[] num, int pos1, int pos2) {
        int temp = num[pos1];
        num[pos1] = num[pos2];
        num[pos2] = temp;
        return num;
    }
}
