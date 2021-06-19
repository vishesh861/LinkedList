public class GivenStringCanBeConvertedToPall {

    public void convert(String str) {

        int[] arr = new int[256];

        for (int i=0; i<str.length(); i++) {
            arr[str.charAt(i)]++;
        }
        int count = 0;
        for (int i=0; i<arr.length; i++) {

            if (arr[i] % 2 != 0) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
