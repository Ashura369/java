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
        r1(digits, 0, "");     // Start recursion
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
}
