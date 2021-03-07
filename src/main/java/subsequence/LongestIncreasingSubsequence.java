package arrays;

public class LongestIncreasingSubsequence {

    private int binarySearch(int arr[], int l, int h, int value)
    // this function finds the position of the first integer
    // in arr which is greater than or equal to 'value'
    {
        if(value>arr[h])
            return h+1;
        // if new value is greater than all array values,
        // then it is places at the end
        while(h>l)
        {
            int middle = (h+l)/2;
            if(arr[middle] == value)
                return middle;

            if(arr[middle] > value)
                h = middle;

            else
                l = middle + 1;
        }

        return h;
    }

    public int longestSubsequence(int size, int a[])
    {
        int[] tail = new int[size];
        tail[0] = a[0];
        // tail[i] holds the last value in a sub sequence of length = i+1

        int lastIndex = 0; // the position of last filled index in tail[]

        for(int i=1; i<size; i++)
        {
            int index = binarySearch( tail, 0, lastIndex, a[i] );
            // getting the furthest possible index for a[i]

            tail[index] = a[i];
            lastIndex = Math.max( lastIndex, index );
        }

        return lastIndex + 1;
    }
}
