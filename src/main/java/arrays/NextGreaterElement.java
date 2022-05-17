package arrays;

import java.util.Arrays;
import java.util.Stack;

/*
* Input:  [2, 7, 3, 5, 4, 6, 8]
Output: [7, 8, 5, 6, 6, 8, -1]
* */

public class NextGreaterElement {

    public int[] findNextGreaterElements(int[] input)
    {
        if (input == null) {
            return input;
        }

        int n = input.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);

        Stack<Integer> s = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!s.empty()) {

                if (s.peek() <= input[i]) {
                    s.pop();
                } else {
                    result[i] = s.peek();
                    break;
                }
            }
            s.push(input[i]);
        }
        return result;
    }
}
