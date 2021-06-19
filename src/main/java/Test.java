import java.util.ArrayList;
import java.util.HashSet;

public class Test {

    public int test(String s, String t) {

        int sLen = s.length(), tLen = t.length();
        String str = t;
        if (tLen > sLen) {
            return -1;
        }

        while (str.length() < sLen) {
            str = str + t;
        }

        if (str.length() > sLen) {
            return -1;
        }

        for (int i=1; i<=str.length(); i++) {

            StringBuilder sb = new StringBuilder();

            String sub = str.substring(0, i);

            while (sb.length() < str.length()) {
                sb.append(sub);
            }

            if (sb.toString().equals(str)) {
                return i;
            }
        }

        return -1;



    }

}
