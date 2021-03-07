package strings;

public class SubstringInsideString {

    public void subs(String str1, String str2) {
        int j = 0,k=0;
        for (int i=0; i<str1.length(); i++) {
            if (j == str2.length()) {
                k = i;
                break;
            } else if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            } else {
                j = 0;
            }
        }

        if (j == str2.length()) {
            System.out.println(k - j);
        } else {
            System.out.println("-1");
        }
    }
}
