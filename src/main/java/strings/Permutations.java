package strings;

public class Permutations {
// left = 0, right = str.length()-1
    public void permute(String str, int left, int right) {
        if (left == right)
            System.out.println(str);
        else {
            for (int i = left; i <= right; i++) {
                String swapped = swap(str, left, i);
                permute(swapped, left + 1, right);
            }
        }
    }
    public String swap(String str, int pos1, int pos2) {
        char[] charArray = str.toCharArray();
        char temp = charArray[pos1];
        charArray[pos1] = charArray[pos2];
        charArray[pos2] = temp;
        return String.valueOf(charArray);
    }

}
