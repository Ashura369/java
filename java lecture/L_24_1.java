public class L_24_1 {

    static class Node {
        Node[] children;
        boolean end; // marks end of a word

        public Node() {
            children = new Node[26]; // a to z
            end = false;
        }
    }

    static Node root = new Node();

    // Insert a word
    public static void insert(String word) {
        Node curr = root;  // keep root fixed
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

                /*
                
                    suppose we are iterating through the word "the", and idx = t - a, which gives 19 

                    Even if 't' - 'a' gives you 19, and 19 is just a number — it still represents the letter 't' in the context of your TRIE.

                    Even though the result of 't' - 'a' is simply the number 19, that number carries a specific meaning within the context of the trie. In programming, characters like 'a', 'b', 'c', etc., have underlying numeric values based on their ASCII or Unicode codes. When you subtract 'a' from 't', you're essentially calculating how far 't' is from 'a' in the alphabet, which is 19 positions ahead. This number, 19, is then used as an index in the children array of the trie node, which has 26 slots corresponding to the 26 lowercase letters. So while 19 is just a number, in the context of the trie, it specifically refers to the letter 't'. The code doesn’t explicitly say “19 means 't'”, but the mapping is established by the logic 'char' - 'a'. Later, if you need to convert back from index 19 to the letter, you can do (char)(19 + 'a'), which gives you 't' again. So yes — even though 19 is just a numeric value, it effectively represents 't' because of how the trie is designed to interpret it.

                    The same will go for other characters.

                */

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            if (i == word.length() - 1) {
                curr.children[idx].end = true;
            }

            curr = curr.children[idx];  // move forward

                /*
                
                When "there" will be passed it will no create new nodes the t, h, and e. It will simply reiterate over t, h, and e node which were passed when "the" was called

                */
        }
    }

    // Search a word
    public static boolean search(String key) {
        Node curr = root;  // keep root fixed
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];

            if (node == null) {
                return false;
            }

            if (i == (key.length() - 1) && !node.end) {
                return false;
            }

            curr = curr.children[idx];
        }
        return true;
    }

    // Print all words in the trie
    public static void printTrie() {
        printHelper(root, "");
    }

    // Helper function to recursively build and print words
    private static void printHelper(Node node, String word) {
        if (node.end) {
            System.out.println(word);
        }

        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                char ch = (char) (i + 'a');
                printHelper(node.children[i], word + ch);
            }
        }
    }

    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any"};

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        // Searching words
        System.out.println("Search results:");
        System.out.println("their → " + search("their")); // true
        System.out.println("thor  → " + search("thor"));  // false
        System.out.println("an    → " + search("an"));    // false

        // Printing the trie contents
        System.out.println("\nWords in the trie:");
        printTrie();

        /*
        No, the words in a trie are not stored alphabetically because of the order of the array. Instead, the trie organizes words based on their character structure, not on the order in which they're inserted. Each character in a word is mapped to an index between 0 and 25 using the expression char - 'a', where 'a' maps to index 0, 'b' to 1, and so on up to 'z' at index 25. Because of this fixed indexing, a trie naturally forms a lexicographical (alphabetical) structure, regardless of the order in which words are added. For example, even if you insert the words "the", "any", "their", "a", and "there" in a random order, the trie will still organize them such that all words starting with 'a' will appear before those starting with 't', because 'a' maps to index 0 and 't' maps to index 19. So the structure of the trie inherently reflects the alphabetical relationships between characters, and that’s why the stored words appear in sorted order — not because of the array’s order, but because of how the trie builds branches for each character.

        root
        ├── a (end = true)
        │   └── n
        │       └── y (end = true)
        ├── t
        │   └── h
        │       └── e (end = true)
        │           ├── i
        │           │   └── r (end = true)
        │           └── r
        │               └── e (end = true)

        */
    }
}
