import java.util.Arrays;
import java.util.HashMap;

public class LongestSubstring {

    public int longestUniqueSubsttr(String s)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        int maximum_length = 0;
        int start = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                start = Math.max(start, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            maximum_length = Math.max(maximum_length, i-start + 1);
        }
        return maximum_length;

    }

}
