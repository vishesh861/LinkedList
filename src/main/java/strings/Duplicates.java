package strings;

public class Duplicates {

    public void duplicate(String str) {


        int[] arr = new int[256];

        for (int i=0; i<str.length(); i++) {
            arr[str.charAt(i)]++;
        }

        for (int i=97; i<=122; i++) {
            if (arr[i] > 1) {
                System.out.print((char)i + " ");
            }
        }
    }
}
