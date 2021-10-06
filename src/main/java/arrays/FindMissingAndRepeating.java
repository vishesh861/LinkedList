package arrays;

// You are given a read only array of n integers from 1 to n.
//Input:[3 1 2 5 3]
//Output:[3, 4]
//A = 3, B = 4

public class FindMissingAndRepeating {

    public void missing() {
        int[] arr = {3,1,2,5,3};
        for (int i=0; i<arr.length; i++) {

            if (arr[i] != i+1 && arr[arr[i] - 1] != arr[i]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
                i--;
            }
        }


        for (int i=0; i<arr.length; i++) {

            if (arr[i] != i+1) {
                System.out.println(arr[i]);
                System.out.println(i+1);
                break;
            }
        }
    }
}
