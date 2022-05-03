package arrays;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(ArrayList<Integer> arr) {
        int n=arr.size();
        int j=1;
        for(int i=1;i<n;i++)
        {
            if(arr.get(i).equals(arr.get(j-1))==false)
            {
                arr.set(j,arr.get(i));
                j++;
            }
        }
        return j;
    }

}
