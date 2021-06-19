package arrays;

public class MinSwapsToMakeStringPall {

    public int min(String str) {

        int n = str.length();

        char[] arr = str.toCharArray();
        int count = 0;
        for (int i=0; i<n/2; i++) {

            int left = i;

            int right = n-left-1;

            while (left < right) {

                if (arr[left] == arr[right]) {
                    break;
                } else {
                    right--;
                }
            }

            if (left == right) {
                return -1;
            } else {
                for (int j=right; j<n-left-1; j++) {

                    char c = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = c;
                    count++;
                }
            }
        }
        return count;

    }
}
