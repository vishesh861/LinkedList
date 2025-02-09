package strings;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*SmallestWindowContainingAllString smallestWindowContainingAllString = new SmallestWindowContainingAllString();
        String s = "ADOBECODEBANC";
        String t = "ABC";

        smallestWindowContainingAllString.min(s,t);*/

        String beginWord = "hit", endWord = "cog";
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");
        WordLadder w = new WordLadder();
        w.ladderLength(beginWord, endWord, wordList);
    }
}
