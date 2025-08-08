// backTracking = it about finding all possible solutions and using the one we want


public class L_15_0_backTracking {
    public static void main(String[] args) {
        String str = "abc";
        bTracking(str, 0, "");
    }

    public static void bTracking(String str, int idx, String crr) {
        if (idx == str.length()) {
            System.out.println(crr);
            return;
        }

        // Include the crr character
        bTracking(str, idx + 1, crr + str.charAt(idx));

        // Exclude the crr character (Backtrack)
        bTracking(str, idx + 1, crr);

        /*
        
            bTracking("abc", "")
            ├── include 'a' → bTracking("bc", "a")
            │   ├── include 'b' → bTracking("c", "ab")
            │   │   ├── include 'c' → bTracking("", "abc") → print: "abc"
            │   │   └── exclude 'c' → bTracking("c", "ab") → print: "ab"
            │   └── exclude 'b' → bTracking("c", "a")
            │       ├── include 'c' → bTracking("", "ac") → print: "ac"
            │       └── exclude 'c' → bTracking("c", "a") → print: "a"
            └── exclude 'a' → bTracking("bc", "")
                ├── include 'b' → bTracking("c", "b")
                │   ├── include 'c' → bTracking("", "bc") → print: "bc"
                │   └── exclude 'c' → bTracking("c", "b") → print: "b"
                └── exclude 'b' → bTracking("c", "")
                    ├── include 'c' → bTracking("", "c") → print: "c"
                    └── exclude 'c' → bTracking("c", "") → print: ""

        */


    }
}
