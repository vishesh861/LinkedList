package scheduling;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingSchedule {

    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int currentDay = 0;
        int eventsCount = 0;
        int idx = 0;

        while(idx < events.length || !minHeap.isEmpty()) {
            if(minHeap.isEmpty()) {
                currentDay = events[idx][0];
            }

            // Remove events that finished before current day
            while(!minHeap.isEmpty() && minHeap.peek() < currentDay) {
                minHeap.poll();
            }

            while(idx < events.length && events[idx][0] == currentDay) {
                minHeap.offer(events[idx][1]);
                idx++;
            }

            // Attend event if possible
            if(!minHeap.isEmpty() && minHeap.peek() >= currentDay) {
                eventsCount++;
                currentDay++;
                minHeap.poll();
            }
        }

        return eventsCount;
    }
}
