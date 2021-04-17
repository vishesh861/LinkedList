package arrays;

public class Stairs {

    public void count(int m, int n) {

        int[] arr = new int[m+1];
        arr[0] = 1;
        int temp = 0;
        for (int i=1; i<=m; i++) {

            int s = i-n-1;
            int e = i-1;

            if (s >= 0) {
                temp -= arr[s];
            }

            temp += arr[e];
            arr[i] = temp;
        }

        System.out.println(arr[m]);
    }
}
