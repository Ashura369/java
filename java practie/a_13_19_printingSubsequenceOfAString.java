// print all the  subsequence of a string using recursion
// string -- "abc"

public class a_13_19_printingSubsequenceOfAString {
    public static void main(String[] args) {
        String str = "abc";

        r1(str, 0, "");
    }

    public static void r1(String str, int idx, String current) {
        if (idx == str.length()) {
            System.out.println(current);
            return;
        }

        // includes current character
        r1(str, idx+1, current + str.charAt(idx));

        // exclude current character
        r1(str, idx+1, current);

        /*

        r1("abc", 0, "")
        ├── include 'a' → r1("abc", 1, "a")
        │   ├── include 'b' → r1("abc", 2, "ab")
        │   │   ├── include 'c' → r1("abc", 3, "abc") → print: "abc"
        │   │   └── exclude 'c' → r1("abc", 3, "ab") → print: "ab"
        │   └── exclude 'b' → r1("abc", 2, "a")
        │       ├── include 'c' → r1("abc", 3, "ac") → print: "ac"
        │       └── exclude 'c' → r1("abc", 3, "a")  → print: "a"
        └── exclude 'a' → r1("abc", 1, "")
            ├── include 'b' → r1("abc", 2, "b")
            │   ├── include 'c' → r1("abc", 3, "bc") → print: "bc"
            │   └── exclude 'c' → r1("abc", 3, "b")  → print: "b"
            └── exclude 'b' → r1("abc", 2, "")
                ├── include 'c' → r1("abc", 3, "c")  → print: "c"
                └── exclude 'c' → r1("abc", 3, "")   → print: ""

        */


    }
    
}
