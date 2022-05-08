package strings;

/*
Input: s = "deeedbbcccbdaa", k = 3
Output: "aa"
* */
public class RemoveDuplicates {

    public String removeDuplicates(String s, int k) {

        int[] count = new int[s.length()];
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            sb.append(c);
            int index = sb.length()-1;
            count[index] = 1 + (index > 0 && sb.charAt(index) == sb.charAt(index-1) ? count[index-1] : 0);
            if (count[index] >= k) {
                sb.delete(sb.length()-k, sb.length());
            }
        }

        return sb.toString();
    }
}
