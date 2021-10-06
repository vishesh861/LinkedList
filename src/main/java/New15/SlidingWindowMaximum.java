package New15;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

        public void max(int[] arr, int k) {

            Deque<Integer> d = new LinkedList<>();
            ArrayList<Integer> result = new ArrayList<>();
            for (int i=0; i<k; i++) {

                while (!d.isEmpty() && arr[i] >= arr[d.peekLast()]) {
                    d.removeLast();
                }

                d.addLast(i);
            }

            for (int i=k; i<arr.length; i++) {

                result.add(d.peekFirst());

                while (!d.isEmpty() && i-k >= d.peekFirst()) {
                    d.removeFirst();
                }

                while (!d.isEmpty() && arr[i] >= arr[d.peekLast()]) {
                    d.removeLast();
                }

                d.addLast(i);
            }

        }
}
