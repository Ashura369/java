public class L_24_3_wordBreakProblem {

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
        word = word.toLowerCase();  // ensure lowercase
        Node curr = root;
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
        key = key.toLowerCase();
        Node curr = root;
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

    // Word Break Problem
    public static boolean wordBreak(String key) {
        if (key.length() == 0) {
            return true;
        }

        for (int i = 1; i <= key.length(); i++) {
            String firstPart = key.substring(0, i);
            String secPart = key.substring(i);

            if (search(firstPart) && wordBreak(secPart)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String words[] = {"i", "like", "sam", "samsung", "mobile"};
        String key = "ilikesamsung";
        String key2 = "ilikesung";
        String key3 = "ilikesam";

        for (int i = 0; i < words.length; i++) {   // ✅ fixed loop
            insert(words[i]);
        }

        System.out.println(wordBreak(key));  // expected output: true
        System.out.println(wordBreak(key2));
        System.out.println(wordBreak(key3));    
    }
}
