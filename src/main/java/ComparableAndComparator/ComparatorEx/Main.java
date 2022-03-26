package ComparableAndComparator.ComparatorEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String[] arr = {"vishesh","Ayush","Suraj","suraj","Raj","vishesh", "vishesh"};

        HashMap<String, Integer> map = new HashMap<>();

        for (int i=0; i<arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }

        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new ComparatorDemo());

        for (int i=0; i<map.size(); i++) {

            int j = list.get(i).getValue();
            while (j > 0) {
                System.out.print(list.get(i).getKey() + ",");
                j--;
            }
        }
    }
}
