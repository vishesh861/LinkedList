public class Duplicate {

    static int repeatedCharacter(String S)
    {
        // Initialize leftmost index of every
        // character as -1.
        int firstIndex[]= new int[256];
        for (int i = 0; i <256; i++)
            firstIndex[i] = -1;

        // Traverse from left and update result
        // if we see a repeating character whose
        // first index is smaller than current
        // result.
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < S.length(); i++) {
            if (firstIndex[S.charAt(i)] == -1)
                firstIndex[S.charAt(i)] = i;
            else
                res = Math.min(res, firstIndex[S.charAt(i)]);
        }

        return (res == Integer.MAX_VALUE) ? - 1 : res;
    }
}
