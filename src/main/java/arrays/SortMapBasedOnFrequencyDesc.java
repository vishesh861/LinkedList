package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class SortMapBasedOnFrequencyDesc {

    public void sort(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        PriorityQueue<Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((x, y) -> {
            if (x.getValue() == y.getValue()) {
                return Integer.compare(x.getKey(), y.getKey());
            }
            return Integer.compare(y.getValue(), x.getValue());
        });

        maxHeap.addAll(map.entrySet());

        while (!maxHeap.isEmpty()) {
            Map.Entry<Integer, Integer> m = maxHeap.poll();
            System.out.print(m.getKey() + " " + m.getValue());
            System.out.println();
        }
    }

}
