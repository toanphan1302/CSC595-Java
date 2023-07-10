import java.io.*;

public class TrieMain {

    public static Trie tree;

    public static void load() throws FileNotFoundException, IOException {

        tree = new Trie();

        // File file = new File("words_alpha.txt");

        BufferedReader reader = new BufferedReader(
                new FileReader("C:\\Users\\toanp\\source\\repos\\CSC595-Java\\CSC595-HW\\src\\words_alpha.txt"));

        String input;
        while ((input = reader.readLine()) != null) {
            input = input.trim();
            tree.insert(input);
        }
        reader.close();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        load();
        System.out.println(tree.wordSuggestion("a"));
        System.out.println(tree.spellCheck("check"));
    }
}
