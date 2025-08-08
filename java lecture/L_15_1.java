// this is another code of backtracking

public class L_15_1 {
    public static void main(String[] args) {
        String str = "abc";
        bTracking(str, "");
    }

    public static void bTracking(String str, String perm) {
        if (str.length() == 0) { // base case
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String newStr = str.substring(0, i) + str.substring(i + 1);
            char crrChar = str.charAt(i);
            bTracking(newStr, perm + crrChar);

            /*
            
                bTracking("abc", "")
                │
                ├── pick 'a' → newStr = "bc"
                │   bTracking("bc", "a")
                │   │
                │   ├── pick 'b' → newStr = "c"
                │   │   bTracking("c", "ab")
                │   │   │
                │   │   └── pick 'c' → newStr = ""
                │   │       bTracking("", "abc") → print "abc"
                │   │
                │   └── pick 'c' → newStr = "b"
                │       bTracking("b", "ac")
                │       │
                │       └── pick 'b' → newStr = ""
                │           bTracking("", "acb") → print "acb"
                │
                ├── pick 'b' → newStr = "ac"
                │   bTracking("ac", "b")
                │   │
                │   ├── pick 'a' → newStr = "c"
                │   │   bTracking("c", "ba")
                │   │   │
                │   │   └── pick 'c' → newStr = ""
                │   │       bTracking("", "bac") → print "bac"
                │   │
                │   └── pick 'c' → newStr = "a"
                │       bTracking("a", "bc")
                │       │
                │       └── pick 'a' → newStr = ""
                │           bTracking("", "bca") → print "bca"
                │
                └── pick 'c' → newStr = "ab"
                    bTracking("ab", "c")
                    │
                    ├── pick 'a' → newStr = "b"
                    │   bTracking("b", "ca")
                    │   │
                    │   └── pick 'b' → newStr = ""
                    │       bTracking("", "cab") → print "cab"
                    │
                    └── pick 'b' → newStr = "a"
                        bTracking("a", "cb")
                        │
                        └── pick 'a' → newStr = ""
                            bTracking("", "cba") → print "cba"

            */
        }
    }
}
