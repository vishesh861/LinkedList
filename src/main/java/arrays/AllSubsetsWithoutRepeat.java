package arrays;

import java.util.ArrayList;
import java.util.List;

public class AllSubsetsWithoutRepeat {

    public void subset(int[] arr) {

        List<List<Integer>> output = new ArrayList();
        output.add(new ArrayList<Integer>());

        for (int num : arr) {
            List<List<Integer>> newSubsets = new ArrayList();
            for (List<Integer> curr : output) {
                ArrayList<Integer> l = new ArrayList<Integer>(curr);
                newSubsets.add(new ArrayList<Integer>(curr){{add(num);}});
            }
            for (List<Integer> curr : newSubsets) {
                output.add(curr);
            }
        }
        System.out.println(output);
    }
}
