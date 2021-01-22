import java.util.Arrays;

public class Anagram {

    public Boolean isAnagram(char[] s1, char[] s2) {

        int CHAR = 256;

        int[] count1 = new int[CHAR];
        Arrays.fill(count1, 0);
        int[] count2 = new int[CHAR];
        Arrays.fill(count2, 0);

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



    }

}

