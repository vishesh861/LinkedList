public class Gcd {

    /*public void gcd_twoNum(int a, int b) {

        int gcd = 0;
        for (int i=1; i<=a && i<=b; i++) {

            if (a%i==0 && b%i==0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }*/

    public int gcd(int a, int b) {

        if (a == 0) {
            return b;
        }

        return gcd(b%a, a);
    }

    public void gcd_arr(int[] arr) {
        int result = arr[0];
        for (int i=1; i<arr.length; i++) {
            result = gcd(result, arr[i]);
        }

        if (result == 1) {
            System.out.println("1");
        }

        System.out.println(result);

    }
}
