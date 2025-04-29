package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class SortMapBasedOnFrequencyDesc {

    public void sort(String[] arr) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        PriorityQueue<Entry<String, Integer>> maxHeap = new PriorityQueue<>((x, y) -> {
            if (x.getValue() == y.getValue()) {
                return x.getKey().compareTo(y.getKey());
            }
            return Integer.compare(y.getValue(), x.getValue());
        });

        maxHeap.addAll(map.entrySet());

        while (!maxHeap.isEmpty()) {
            Map.Entry<String, Integer> m = maxHeap.poll();
            System.out.print(m.getKey() + " " + m.getValue());
            System.out.println();
        }
    }

}
