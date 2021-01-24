import java.util.HashMap;
import java.util.Map;

public class TargetSum {

    public int[] two_sum(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] {
                        map.get(complement), i
                };
            }
        }
        throw new IllegalArgumentException("No two sum solution");

    }
}
