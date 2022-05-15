package strings;

import java.util.ArrayList;
import java.util.List;

/*
* Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
* */

public class OldTelephone {

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();
        if (digits.length() == 0 || digits == null) {
            return result;
        }
        String[] arr = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtracking(0,result,digits,new StringBuilder(), arr);
        return result;
    }

    private void backtracking(int idx,List<String> result,String digits,StringBuilder temp,String[] arr) {

        if (temp.length() == digits.length()) {

            result.add(temp.toString());
        } else {

            char[] c = arr[digits.charAt(idx) - '2'].toCharArray();

            for (int j=0; j<c.length; j++) {
                temp.append(c[j]);
                backtracking(idx+1,result,digits,temp,arr);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
}
