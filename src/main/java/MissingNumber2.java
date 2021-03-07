public class MissingNumber2 {

    public void missing_two(int[] arr, int n) {

        boolean []mark = new boolean[n+13];
        for (int i = 0; i < n-3; i++)
            mark[arr[i]] = true;

        // Print two unmarked elements
        System.out.println("Two Missing Numbers are");
        for (int i = 13; i <= n+12; i++)
            if (! mark[i])
                System.out.print(i + " ");

        System.out.println();
        }
    }

