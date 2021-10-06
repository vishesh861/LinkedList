package arrays;

import java.util.ArrayList;

public class NthPrimeNumber {

    public void nthPrime(int n) {

        ArrayList<Integer> list = new ArrayList<>();
        boolean[] b = new boolean[1000000];
        for (int i=0; i<1000000; i++) {
            b[i] = true;
        }

        for (int i=2; i*i<1000000; i++) {

            if (b[i] == true) {

                for (int j=i*i; j<1000000; j+=i) {
                    b[j] = false;
                }
            }
        }

        for (int i=2; i<1000000; i++) {
            if (b[i] == true) {
                list.add(i);
            }
        }

        System.out.println(list.get(n));
    }
}
