package trie;


public class Search {

    public boolean search(TrieNode root, String key) {

        int level;
        int length = key.length();
        int index;
        TrieNode pCrawl = root;

        for (level = 0; level < length; level++) {
            index = key.charAt(level) - 'a';

            if (pCrawl.children[index] == null)
                return false;

            pCrawl = pCrawl.children[index];
        }
        //returning true if key is present else false.
        return (pCrawl != null && pCrawl.isEndOfWord);
    }
}
