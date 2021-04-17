package DynamicProgramming.LCS;

public class LongestCommonSubsequenceRecursive {

    public int longest(String str1, String str2, int m, int n) {

        if (m == 0 || n == 0) {
            return 0;
        } else {

            if (str1.charAt(m-1) == str2.charAt(n-1)) {
                return longest(str1, str2, m-1, n-1);
            } else {
                return Integer.max(longest(str1, str2, m, n-1), longest(str1, str2, m-1, n));
            }
        }
    }
}
