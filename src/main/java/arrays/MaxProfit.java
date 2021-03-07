package arrays;

public class MaxProfit {

    public void max(int arr[]) {

        int min = Integer.MAX_VALUE;
        int max = 0,j=0,k=0;

        for (int i=0; i<arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
                j = i;
            } else if (arr[i] - min >  max) {
                max = arr[i] - min ;
                k = i;
            }
        }

        System.out.println(max);
        System.out.println(j + " " + k);
    }
}
