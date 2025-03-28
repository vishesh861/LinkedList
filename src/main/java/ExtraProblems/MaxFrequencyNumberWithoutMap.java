package ExtraProblems;

public class MaxFrequencyNumberWithoutMap {

    public void maxFrequency(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                max = arr[i];
            }
            if (max == arr[i]) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int num : arr) {
            if (num == max)
                count++;
        }

        System.out.println("Max Element " + max + " Frequency " + count);
    }

}
