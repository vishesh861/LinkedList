import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class TestDemo {
    //arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}
   // dep[] = {9:10, 10:20, 11:30,12:00, 19:00, 20:00}
    public void test(int[] arrival, int[] departure) {

        int count = 1;
        int i = 1;
        int max = 0,min = 0, temp = 0;

        while (i < arrival.length || i < departure.length) {

            if (arrival[i] < departure[i-1] && max == min) {
                count++;
                min = departure[i-1];
                max = departure[i];
            } else if (min == max && departure[i-1] < arrival[i]) {
                i++;
                continue;
            } else if (min != max && arrival[i] > min && arrival[i] < max) {
                i++;
                continue;
            } else if (min != max && arrival[i] < min && arrival[i] < max) {
                count++;
            } else if (min != max && arrival[i] > min && arrival[i] > max) {
                temp = count;
                count = 1;
                min = departure[i-1];
                max = departure[i];
            }

            i++;
        }

        System.out.println(temp);

    }



}

