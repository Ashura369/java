/*
You’re Thinking Iteratively, But Recursion Is Declarative
When we usually code (loops, conditions), we think in terms of how to do things step by step.

But recursion works differently — you don’t always see how it works step-by-step. Instead, you define:
*/


/*
Printing the keypad combination using recursion

0 -- .
1 -- abc
2 -- def
3 -- ghi
4 -- jkl
5 -- mno
6 -- pqrs
7 -- tu
8 -- vwx
9 -- yz


*/


public class a_13_20_keypadCombination {
    // Keypad mapping
    
    static String[] keypad = {
        ".",      // 0
        "abc",    // 1
        "def",    // 2
        "ghi",    // 3
        "jkl",    // 4
        "mno",    // 5
        "pqrs",   // 6
        "tu",     // 7
        "vwx",    // 8
        "yz"      // 9
    };

    public static void main(String[] args) {
        String digits = "12";  // Example input
        r1(digits, 0, "");
        System.out.println();
        r2(digits, 0, "");
    }

    // Recursive function to print combinations
    public static void r1(String digits, int idx, String current) {
        if (idx == digits.length()) {
            System.out.println(current);
            return;
        }

        char digit = digits.charAt(idx);          // e.g., '2'
        int digitValue = digit - '0';             // Convert char to int
        String letters = keypad[digitValue];      // Get corresponding letters

        for (int i = 0; i < letters.length(); i++) {
            r1(digits, idx + 1, current + letters.charAt(i));
        }
    }


    public static void r2(String digits, int idx, String current) {
        if (idx == digits.length()) {
            System.out.println(current);
            return;
        }

        char digit = digits.charAt(idx);          // e.g., '2'
        int digitValue = Integer.parseInt(String.valueOf(digit));      // here we converted string into int, which is a more feasable way to understand
        String letters = keypad[digitValue];      // Get corresponding letters

        for (int i = 0; i < letters.length(); i++) {
            r2(digits, idx + 1, current + letters.charAt(i));
        }
        
        /*
        r2("12", 0, "")
        ├── r2("12", 1, "a")
        │   ├── r2("12", 2, "ad") → Print: ad
        │   ├── r2("12", 2, "ae") → Print: ae
        │   └── r2("12", 2, "af") → Print: af
        ├── r2("12", 1, "b")
        │   ├── r2("12", 2, "bd") → Print: bd
        │   ├── r2("12", 2, "be") → Print: be
        │   └── r2("12", 2, "bf") → Print: bf
        └── r2("12", 1, "c")
            ├── r2("12", 2, "cd") → Print: cd
            ├── r2("12", 2, "ce") → Print: ce
            └── r2("12", 2, "cf") → Print: cf
        
         ------------------------------------------------------------
        | Call Depth | idx | current | digit | digitValue | letters |
        ------------------------------------------------------------
        |     1      |  0  |   ""     |  '1'  |     1      |  "abc"  |
        |     2      |  1  |   "a"    |  '2'  |     2      |  "def"  |
        |     3      |  2  |  "ad"    |   -   |     -      |    -    |
        |     ↑      |     |  Prints: ad                       |
        |     3      |  2  |  "ae"    |   -   |     -      |    -    |
        |     ↑      |     |  Prints: ae                       |
        |     3      |  2  |  "af"    |   -   |     -      |    -    |
        |     ↑      |     |  Prints: af                       |
        |     2      |  1  |   "b"    |  '2'  |     2      |  "def"  |
        |     3      |  2  |  "bd"    |   -   |     -      |    -    |
        |     ↑      |     |  Prints: bd                       |
        |     3      |  2  |  "be"    |   -   |     -      |    -    |
        |     ↑      |     |  Prints: be                       |
        |     3      |  2  |  "bf"    |   -   |     -      |    -    |
        |     ↑      |     |  Prints: bf                       |
        |     2      |  1  |   "c"    |  '2'  |     2      |  "def"  |
        |     3      |  2  |  "cd"    |   -   |     -      |    -    |
        |     ↑      |     |  Prints: cd                       |
        |     3      |  2  |  "ce"    |   -   |     -      |    -    |
        |     ↑      |     |  Prints: ce                       |
        |     3      |  2  |  "cf"    |   -   |     -      |    -    |
        |     ↑      |     |  Prints: cf                       |
        ------------------------------------------------------------

        Total combinations printed: ad, ae, af, bd, be, bf, cd, ce, cf

        */

    }
}
