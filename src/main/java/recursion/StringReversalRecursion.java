package recursion;

public class StringReversalRecursion {

    public void recursion(String str) {

        if (str == null || str.length() <=1) {
            System.out.println(str);
        } else {
            System.out.println(str.charAt(str.length()-1));
            recursion(str.substring(0, str.length()-1));
        }

    }
}
