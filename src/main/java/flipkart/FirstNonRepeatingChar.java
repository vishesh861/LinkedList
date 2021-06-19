package flipkart;

import java.util.LinkedList;
import java.util.Queue;

//  abadbc
//    "a"      -   first non repeating character 'a'
//    "ab"     -   first non repeating character 'a'
//    "aba"    -   first non repeating character 'b'
//    "abad"   -   first non repeating character 'b'
//    "abadb"  -   first non repeating character 'd'
//    "abadbc" -   first non repeating character 'd'
public class FirstNonRepeatingChar {

    public String nonRepeat(String str) {

        int[] arr = new int[26];
        Queue<Character> q = new LinkedList<>();
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<str.length(); i++) {

            q.add(str.charAt(i));
            arr[str.charAt(i) - 'a']++;
            char b = '#';
            while (!q.isEmpty()) {

                if (arr[q.peek() - 'a'] == 1) {
                    b = q.peek();
                    break;
                } else {
                    q.poll();
                }

            }
            sb.append(b);
        }
        return sb.toString();
    }


}
