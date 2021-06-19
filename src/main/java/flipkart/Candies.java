package flipkart;

// Ques : 1. Each child must have at least one candy.
//2. Children with a higher rating get more candies than their neighbors.

import java.util.Arrays;

public class Candies {

    public int candy(int[] A)
    {
        int size = A.length;
        int[] tmp = new int[size];
        Arrays.fill(tmp,1);
        for(int i = 1; i < size; i++)
        {
            if(A[i] > A[i-1])
                tmp[i] = tmp[i-1] + 1;
        }
        for(int i = size - 2; i >=0; i--)
        {
            if(A[i] > A[i+1]) {
                tmp[i] = Math.max(tmp[i + 1] + 1, tmp[i]);
            }
        }
        int ans = 0;
        for(int val : tmp)
            ans+= val;
        return ans;
    }
}
