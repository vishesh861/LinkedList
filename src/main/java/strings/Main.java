package strings;

public class Main {

    public static void main(String[] args) {
        /*SmallestWindowContainingAllString smallestWindowContainingAllString = new SmallestWindowContainingAllString();
        String s = "ADOBECODEBANC";
        String t = "ABC";

        smallestWindowContainingAllString.min(s,t);*/

        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        groupAnagrams.groupAnagrams(arr);
    }
}
