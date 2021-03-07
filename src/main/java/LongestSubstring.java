import java.util.Arrays;

public class LongestSubstring {

    public int longestUniqueSubsttr(String str)
    {
         int[] arr = new int[256];
         int j=0,k=0;
         for (int i=0; i<str.length(); i++) {

             j = Math.max(j, arr[str.charAt(i)] + 1);

             k = Math.max(k, i-j+1);

             arr[str.charAt(i)] = i;
         }

         return k;
    }
}
