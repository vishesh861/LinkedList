package arrays;

import java.util.Arrays;
import java.util.Comparator;

//Given [3, 30, 34, 5, 9], the largest formed number is 9534330
public class LargestNumber {

    public void largest() {
        int[] arr = {3, 30, 34, 5, 9};
        String[] a = new String[arr.length];
        for (int i=0; i<arr.length; i++) {

            a[i] = String.valueOf(arr[i]);
        }

        Arrays.sort(a, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        StringBuilder str = new StringBuilder();

        for (String s : a) {
            str.append(s);
        }

        while (str.charAt(0) == '0' && str.length() > 1) {
            str.deleteCharAt(0);
        }

        System.out.println(str.toString());



    }
}
