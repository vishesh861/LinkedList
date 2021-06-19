import java.util.Arrays;
import java.util.Comparator;

public class ParkingLot {

    public int parking(int[][] slots) {

       if (slots.length <= 1) {
           return slots.length;
       } else {

           Arrays.sort(slots, new Comparator<int[]>() {
               @Override
               public int compare(int[] o1, int[] o2) {
                   return o1[0] - o2[0];
               }
           });

           int max = 0, curr = 1, end = slots[0][1];
           for (int i=0; i<slots.length; i++) {

               if (end > slots[i + 1][0]) {
                   curr++;
                   max = curr > max ? curr : max;
               } else {
                   curr--;
               }

               end = Math.max(end, slots[i + 1][1]);
           }
           return max;
       }
    }
}
