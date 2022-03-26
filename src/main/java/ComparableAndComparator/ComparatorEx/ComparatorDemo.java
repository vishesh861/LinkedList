package ComparableAndComparator.ComparatorEx;

import java.util.Comparator;
import java.util.Map;

public class ComparatorDemo implements Comparator<Map.Entry<String,Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        if (o1.getValue() < o2.getValue()) {
            return 1;
        } else if (o1.getValue() > o2.getValue()) {
            return -1;
        } else if (o1.getValue() == o2.getValue()) {
            return o1.getKey().compareTo(o2.getKey());
        }

        return Integer.MIN_VALUE;
    }
}
