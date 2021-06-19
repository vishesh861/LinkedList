import java.util.ArrayList;
import java.util.List;

public class MaxGCD {

    public void max(int[] arr) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    list.add(temp);
                }
            }
        }
        int max = 0,k = 0, gcd1=0,gcd2=0;;
        for (int i = 0; i < list.size(); i++) {

            List<Integer> l = list.get(i);
            int a = l.get(0);
            int b = l.get(1);
            int gcd = 1;
            for (int j = 1; j <= a && j <= b; j++) {
                if (a % j == 0 && b % j == 0) {
                    gcd = j;
                }
            }

            if (k == 0) {
                gcd1 = gcd;
                k++;
            } else if (k == 1) {
                gcd2 = gcd;
                k = 0;
                gcd = (gcd1 * 1) + (gcd2 * 2);
                if (max < gcd) {
                    max = gcd;
                }
            }
        }

        System.out.println(max);
    }
}
