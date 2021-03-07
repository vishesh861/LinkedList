import java.util.HashSet;
import java.util.Hashtable;

public class Substring {

    public Boolean subs(int[] arr, int sumPresent) {

        HashSet<Integer> hashSet = new HashSet<>();
        int sum = 0;
        hashSet.add(0);
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
            int diff = sum - sumPresent;
            if (hashSet.contains(diff)) {
                return true;
            } else {
                hashSet.add(sum);
            }
        }
        return false;
    }
}
