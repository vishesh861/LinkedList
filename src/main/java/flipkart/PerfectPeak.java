package flipkart;

import java.util.ArrayList;

//You need to check that whether there exist a element which is strictly greater than all the elements
// on left of it and strictly smaller than all the elements on right of it.
//If it exists return 1 else return 0.
public class PerfectPeak {

    public int perfect(ArrayList<Integer> A) {

        int[] max = new int[A.size()];
        int[] min = new int[A.size()];

        max[0] = A.get(0);
        min[min.length-1] = A.get(A.size()-1);

        for (int i=1; i<A.size(); i++) {
            max[i] = Math.max(max[i-1], A.get(i));
        }

        for (int i=A.size()-2; i>=0; i--) {
            min[i] = Math.min(min[i+1], A.get(i));
        }

        for (int i=1; i<A.size()-1; i++) {

            if (A.get(i) > max[i-1] && A.get(i) < min[i+1]) {
                return 1;
            }
        }
        return 0;
    }
}
