package arrays;

import java.util.Iterator;
import java.util.PriorityQueue;

public class KLargestElements {

    public void largest(int[] arr, int k) {


        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i=0; i<k; i++) {
            priorityQueue.add(arr[i]);
        }

        for (int i=k; i<arr.length; i++) {

            if (priorityQueue.peek() > arr[i]) {
                continue;
            } else {
                priorityQueue.poll();
                priorityQueue.add(arr[i]);
            }
        }

        Iterator iterator = priorityQueue.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
