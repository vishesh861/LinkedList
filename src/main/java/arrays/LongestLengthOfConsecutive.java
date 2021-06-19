package arrays;

import java.util.HashMap;
import java.util.HashSet;

public class LongestLengthOfConsecutive {

    public void longest(int[] arr) {

       HashSet<Integer> set = new HashSet<>();

       for (int num : arr) {
           set.add(num);
       }

       int longest = 0;
       for (int num : set) {

           if (!set.contains(num-1)) {
               int count = 1;

               while (set.contains(num+1)) {
                   count += 1;
                   num += 1;
               }

               longest = Math.max(longest, count);
           }
       }

        System.out.println(longest);
    }
}
