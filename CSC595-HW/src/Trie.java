import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Trie {
    class TrieNode {
        public HashMap<Character, TrieNode> children;

        public char currentChar;
        public boolean isEndOfWord = false;

        public TrieNode() {

            this.children = new HashMap<Character, TrieNode>();

            this.currentChar = '\0'; // sets to termination character for root;
        }

        public TrieNode(char c) {

            this.children = new HashMap<Character, TrieNode>();

            this.currentChar = c;
        }
    }

    public TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        // remove case sensitivity
        word = word.toLowerCase();

        var current = root; // copy reference of root

        for (int i = 0; i < word.length(); i++) {

            // if map contains key make current refference of value
            if (current.children.containsKey(word.charAt(i))) {

                current = current.children.get(word.charAt(i));
            } else { // otherwise make k,v pair then get reference
                current.children.put(word.charAt(i), new TrieNode(word.charAt(i)));

                current = current.children.get(word.charAt(i));
            }
        }
        // Set last character to end of word
        current.isEndOfWord = true;
    }

    public boolean spellCheck(String word) {
        // remove case sensitivity
        word = word.toLowerCase();

        var current = root; // copy reference of root

        for (int i = 0; i < word.length(); i++) {

            // if map contains key make current refference of value
            if (current.children.containsKey(word.charAt(i))) {

                current = current.children.get(word.charAt(i));
            } else { // otherwise the word doesn't exsist.
                return false;
            }
        }
        return true;
    }

    // suggest 5 words base on the string input
    public List<String> wordSuggestion(String word) {
        word = word.toLowerCase();

        var lastNode = root; // copy reference of root
        StringBuffer rootCharacters = new StringBuffer();
        List<String> suggestWords = new ArrayList<>();

        // Initialize the StringBuffer for the suggested words
        for (int i = 0; i < word.length(); i++) {
            // if map contains key make current refference of value
            if (lastNode.children.containsKey(word.charAt(i))) {
                rootCharacters.append(word.charAt(i));
                lastNode = lastNode.children.get(word.charAt(i));
            } else {
                break;
            }
        }

        suggestHelper(lastNode, suggestWords, rootCharacters);

        return suggestWords.subList(0, 4);
    }

    public void suggestHelper(TrieNode root, List<String> list, StringBuffer curr) {

        if (root.isEndOfWord) {
            if (!list.contains(curr.toString())) {
                list.add(curr.toString());
            }
        }
        if (isLeaf(root))
            return;

        for (TrieNode child : root.children.values()) {
            suggestHelper(child, list, curr.append(child.currentChar)); // Recursively call suggestHelper on every
                                                                        // child
            curr.setLength(curr.length() - 1);
        }

    }

    public boolean hasNextCahr(char c) {
        throw new NoSuchMethodError();
    }

    public boolean isLeaf(TrieNode node) {
        return node.children.size() == 0;
    }
}