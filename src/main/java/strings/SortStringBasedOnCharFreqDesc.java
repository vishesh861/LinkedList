package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class SortStringBasedOnCharFreqDesc {

    public String frequencySort(String s) {
        Map<Character, Integer> hm = new HashMap<>();

        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Entry<Character, Integer>> pq = new PriorityQueue<>((x, y) -> {
            if (x.getValue() == y.getValue()) {
                return Character.compare(x.getKey(), y.getKey());
            }
            return Integer.compare(y.getValue(), x.getValue());
        });

        pq.addAll(hm.entrySet());

        StringBuilder result = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            while (entry.getValue() >= 1) {
                result.append(entry.getKey());
                entry.setValue(entry.getValue() - 1);
            }
        }

        return result.toString();
    }

}
