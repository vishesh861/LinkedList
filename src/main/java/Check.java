public class Check {

    public boolean check_str(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i=0; i<str1.length(); i++) {

            if ((str1.charAt(i) != 'a' && str1.charAt(i) != 'e' && str1.charAt(i) != 'i' && str1.charAt(i) != 'o'
                    && str1.charAt(i) != 'u') && (str2.charAt(i) == 'a' || str2.charAt(i) == 'e'
                    || str2.charAt(i) == 'i' || str2.charAt(i) == 'o' || str2.charAt(i) == 'u')) {
                return false;
            } else if ((str2.charAt(i) != 'a' && str2.charAt(i) != 'e'
                    && str2.charAt(i) != 'i' && str2.charAt(i) != 'o' && str2.charAt(i) != 'u') && (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' ||
                    str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u')) {
                return false;
            }
        }
        return true;
    }
}
