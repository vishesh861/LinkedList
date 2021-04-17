import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

    public Boolean isAnagram(String s1, String s2) {

        /*int CHAR = 256;

        int[] count1 = new int[CHAR];
        int[] count2 = new int[CHAR];

        for (int i = 0; i < s1.length && i < s2.length; i++) {
            count1[s1[i]]++;
            count2[s2[i]]++;
        }

        if (s1.length != s2.length) {
            return false;
        }

        for (int i = 0; i < CHAR; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }

        return true;

*/
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i=0; i<s1.length(); i++) {
            if (map.containsKey(s1.charAt(i))) {
                map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
            } else {
                map.put(s1.charAt(i), 1);
            }
        }

        for (int i=0; i<s2.length(); i++) {

            if (map.containsKey(s2.charAt(i))) {
                if (map.get(s2.charAt(i)) > 0) {
                    map.put(s2.charAt(i), map.get(s2.charAt(i))-1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;

    }

}

