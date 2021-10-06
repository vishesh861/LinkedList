package arrays;

import java.util.List;

public class MinimumInSortedRotatedArray {

    public int findMin(final List<Integer> a) {
        return findMin(a, 0, a.size()-1);
    }

    public int findMin(final List<Integer> a, int start, int end) {
        if(start==end)
            return a.get(start);
        if(start+1==end)
            return Math.min(a.get(start), a.get(end));
        int med = (start+end)/2;
        if(a.get(med-1)>a.get(med) && a.get(med+1)>a.get(med))
            return a.get(med);
        if(a.get(start)<a.get(med) && a.get(end)<a.get(med))
           return findMin(a, med, end);
        else
             return findMin(a, start, med);
    }
}
