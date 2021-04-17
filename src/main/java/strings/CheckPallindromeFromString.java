package strings;

public class CheckPallindromeFromString {


    public Boolean pall (String str) {

        int[] arr = new int[256];
        int count = 0;
        for (int i=0; i<str.length(); i++) {
            arr[(int)str.charAt(i)]++;
        }

        for (int i=0; i<256; i++) {

            if (arr[i] % 2 != 0) {
                count++;
            }

            if (count > 1) {
                return false;
            }
        }

        return true;
    }
}
