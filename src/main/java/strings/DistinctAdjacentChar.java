package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class DistinctAdjacentChar {

    public static void main(String[] args) {
       // System.out.println(rearrangeString("aaabbc"));  // Output: "ababac"
        System.out.println(rearrangeString("aaab"));  // Output: ""
    }
    public static String rearrangeString(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        maxHeap.addAll(charCount.entrySet());
        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry1 = maxHeap.poll();
            if (result.length() > 0 && result.charAt(result.length() - 1) == entry1.getKey()) {
                if (maxHeap.isEmpty()) {
                    return "";  // Impossible to rearrange
                }
                Map.Entry<Character, Integer> entry2 = maxHeap.poll();
                result.append(entry2.getKey());
                entry2.setValue(entry2.getValue() - 1);
                if (entry2.getValue() > 0) {
                    maxHeap.offer(entry2);
                }
                maxHeap.offer(entry1);
            } else {
                result.append(entry1.getKey());
                entry1.setValue(entry1.getValue() - 1);
                if (entry1.getValue() > 0) {
                    maxHeap.offer(entry1);
                }
            }
        }
        return result.toString();
    }

}
