package arrays;

import java.util.ArrayList;

public class ArrayPermutations {

    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        //start from an empty list
        result.add(new ArrayList<Integer>());

        for (int i = 0; i < num.length; i++) {
            //list of list in current iteration of the array num
            ArrayList<ArrayList<Integer>> current = new ArrayList<ArrayList<Integer>>();

            for (ArrayList<Integer> l : result) {
                // # of locations to insert is largest index + 1
                System.out.println("l_before =" + l);
                for (int j = 0; j < l.size()+1; j++) {

                    // + add num[i] to different locations
                    l.add(j, num[i]);
                    System.out.println("l =" + l);
                    ArrayList<Integer> temp = new ArrayList<Integer>(l);
                    current.add(temp);
                    System.out.println("current =" + current);

                    //System.out.println(temp);

                    // - remove num[i] add
                    l.remove(j);
                    System.out.println("l =" + l);
                }
            }
            result = new ArrayList<ArrayList<Integer>>(current);
            System.out.println("result =" + result);
        }

        return result;

    }
}
