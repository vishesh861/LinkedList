package arrays;

//121   ABA,AU,LA
public class PrintAllCombinationsOfGivenInteger {

    public final String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public void print(int num) {

        String str = Integer.toString(num);

        int[] arr = new int[str.length()];

        for (int i=0; i<str.length(); i++) {

            arr[i] = str.charAt(i) - '0';
        }
        str = "";
        comb(arr, 0, str);

    }

    private void comb(int[] arr, int i, String str) {

        if (i == arr.length) {

            System.out.println(str);
            return;
        }

        int sum = 0;

        for (int j=i; j<=Math.min(i+1, arr.length-1); j++) {

            sum = (sum * 10) + arr[j];

            if (sum > 0 && sum <= 26) {

                comb(arr, j+1, str + alphabet.charAt(sum-1));
            }
        }
    }
}
