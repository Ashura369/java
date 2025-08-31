public class L_24_0_TRIE {
    
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

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            if (i == word.length() - 1) {
                curr.children[idx].end = true;
            }

            curr = curr.children[idx];  // move forward
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

    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any"};

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println(search("their")); // true
        System.out.println(search("thor"));  // false
        System.out.println(search("an"));    // false
    }
}
