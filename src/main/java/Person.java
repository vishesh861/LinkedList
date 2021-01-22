import java.util.Date;

public class Person  {

    public void str_converter(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<str.length(); i++) {
            int a = (int)str.charAt(i);
            if (a > 34 && a < 39) {
                sb.append(str.charAt(i));
                continue;
            }
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u') {
                sb.append(Character.toUpperCase(str.charAt(i)));
                continue;
            }
            if (a > 93 && a < 123) {
                if (a == 122) {
                    char c = (char)94;
                    sb.append(c);
                    continue;
                }
                a++;
                char c = (char)a;
                sb.append(c);
            }
        }

    }
}
