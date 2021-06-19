package scheduling;

import java.util.Arrays;

class Schedule {

    public void sc(int[] arr, int[] dep) {

       /* int n = arr.length;
        int result = 1;
        int[] temp = new int[2361];

        for (int i=0; i<n; i++) {

            ++temp[arr[i]];
            --temp[dep[i] + 1];
        }

        for (int i=1; i<2361; i++) {

            temp[i] = temp[i] + temp[i-1];
            result = Math.max(result, temp[i]);
        }

        System.out.println(result);*/

        int start[] = new int[arr.length];
        int end[] = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            start[i] = arr[i];
            end[i] = dep[i];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int idx = 0;
        for(int i=0; i<start.length; i++) {
            if(start[i]>=end[idx]) {
                idx++;
            }
        }
        System.out.println(end.length-idx);

    }
}
public class SchedulingProblem {
    public static void main(String[] args) {

        int[] arr = {900,  940, 950,  1100, 1500, 1800};
        int[] dep = {910, 1030, 1120, 1130, 1900, 2000};

        Schedule s = new Schedule();
        s.sc(arr, dep);
    }
}
