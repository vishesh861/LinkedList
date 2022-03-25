package strings;

public class ReverseWordsInString {

    String reverseWords(String s)
    {

        String words[] = s.split("\\.");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if(i!=0)
                result += '.';
        }
        //returning the result.
        return result;
    }
}
