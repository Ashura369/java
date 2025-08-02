// removing the duplicates

import java.util.HashSet;
import java.util.Set;

public class a_14_0_hashSets {
    public static void main(String[] args) {
        String str = "abbccddeccebbeaaa";
        StringBuilder sb = new StringBuilder();
        HashSet<Character> valueAvailable = new HashSet<>();
        r1(str, 0, valueAvailable);
        
        // approach 2
        System.out.println();
        r2(str, 0, sb, valueAvailable);
        // even if the syntax for r2 function is correct it will stilll not print the ans bcoz, you are using the same valueAvailable set in both r1 ans r2, so when r2 runs the hash set already contains all the characters from r1. 
        // and as we know hash set only takes unique characters, so no value will be added into it. 
        // so it will print no answers
        // to print the ans, we have to create a new hash set with a different name. then it will print the answers

        // COMMENT OUT THE TWO CODES BELOW AND THE CODE WILL START PRINTING THE ANSWERS

            // HashSet<Character> valueAvailable2 = new HashSet<>();
            // r2(str, 0, sb, valueAvailable2);
    }

    public static void r1(String str, int idx, Set<Character> valueAvailable) {
        if (idx == str.length()) {
            
            System.out.print(valueAvailable+" ");
            return;
        }

        char crrElement = str.charAt(idx);

        if (! valueAvailable.contains(crrElement)) {
            valueAvailable.add(crrElement);
        }

        r1(str, idx+1, valueAvailable);

        // we can proceed with printing the output like this, but our main objective here is to print the output in string format
        // so we have to use the stringBuilder and append the values into it and then convert it back into a string and print the output


    }

    public static void r2(String str, int idx, StringBuilder sb, Set<Character> valueAvailable) {
        if (idx == str.length()) {
            System.out.print(sb+" ");
            return;
        }

        char crrElement = str.charAt(idx);

        if (!valueAvailable.contains(crrElement)) {
            valueAvailable.add(crrElement);
            sb.append(crrElement);
        }

        r2(str, idx+1, sb, valueAvailable);


    }
}
