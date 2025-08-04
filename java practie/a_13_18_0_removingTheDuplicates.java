import java.util.*;

public class a_13_18_0_removingTheDuplicates {
    public static void main(String[] args) {
        String str = "abbccddeccebbeaaa";
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();
        removeDuplicates(str, 0, seen, result);
        System.out.println(result.toString());

        // ****************************************************
        // Another method of solving the qs
        System.err.print("****************************************************************************************");
        System.err.println();
        r1(str, 0, "");
    }

    public static void removeDuplicates(String str, int idx, Set<Character> seen, StringBuilder result) {
        if (idx == str.length()) {
            return;
        }

        char current = str.charAt(idx);

        if (!seen.contains(current)) {
            seen.add(current);
            result.append(current);
        }

        removeDuplicates(str, idx + 1, seen, result);
    }


    public static boolean[] map = new boolean[26];

    public static void r1(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.err.println(newString);
            return;
        }

        char crrChar = str.charAt(idx);
        if (map[crrChar - 'a'] == true) { 
            r1(str, idx+1, newString);
        }else{
            newString += crrChar;
            map[crrChar - 'a'] = true;
            r1(str, idx+1, newString);
        }

        //  This might seem strange at first, but in Java (and most programming languages), characters (char) are actually numeric types under the hood — they represent Unicode (or ASCII) values.
        // that means if i minus a from z i will get 25, and if i do vice versa i will get -25
    }
}
