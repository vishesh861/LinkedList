package strings;

import java.util.Stack;

public class RemoveConsecutiveDuplicates {

    public static String removeConsecutiveDuplicates(String str) {
        Stack<Character> st = new Stack<Character>();

        //iterating over the string.
        for (int i = 0; i < str.length(); i++) {
            //if current character of string is not equal to the character at
            //top of stack, we push the current character into the stack.
            if (st.empty() || st.peek() != str.charAt(i)) {
                st.push(str.charAt(i));
            }
        }
        String res = new String("");

        //adding all characters in the stack to the answer and returning it.
        while (!st.empty()) {
            res = st.peek() + res;
            st.pop();
        }
        return (res);
    }
}