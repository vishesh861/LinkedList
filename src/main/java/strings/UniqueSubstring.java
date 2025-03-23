package strings;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubstring {

    public void uniqueSubstring(String s) {

        Set<String> set = new HashSet<>();

        int i=0;
        int j=s.length();
        while (j > 0) {

            String temp = s.substring(i, j--);
            set.add(temp);

            if (j == i) {
                j = s.length();
                i++;
            }

            if (i == s.length()) {
                break;
            }

        }

        System.out.println(set.size());
    }

}
