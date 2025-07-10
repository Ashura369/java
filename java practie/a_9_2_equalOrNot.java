// checking if two strings are equal or not

import java.util.*;

public class a_9_2_equalOrNot {
    public static void main(String[] args) {
        // this is the manual way of solving the qs. A better approach for this qs is in
        // another function below it

        String a = "Java";
        String b = "java";

        // checking if strings are equal
        if (a.length() != b.length()) {
            System.out.println("STRINGS ARE NOT EQUAL");
        }

        boolean isEqual = true;
        for (int i = 0; i < a.length(); i++) {
            char ch1 = Character.toLowerCase(a.charAt(i));
            char ch2 = Character.toLowerCase(b.charAt(i));
            // bcoz ch1 and ch2 both are "char" values that's why we used "Character." to
            // convert them into lower case. If it were a string in that case we should have
            // used "ch1.toLowerCase()"

            if (ch1 != ch2) {
                isEqual = false;
                break;
            }
        }

        if (isEqual) {
            System.out.println("Strings are equal (ignoring case)");
        } else {
            System.out.println("Strings are not equal");
        }

        System.out.println();
        betterApproach();
    }

    public static void betterApproach() {
        String a = "Java";
        String b = "java";

        if (a.equalsIgnoreCase(b)) { 
            System.out.println("Strings are equal (ignoring case)");
        } else {
            System.out.println("Strings are not equal");
        }

        /*
            a.equalsIgnoreCase(b)

                This is a built-in String method in Java.
                It compares string a and string b.
                It ignores case differences like uppercase (J) vs lowercase (j).
                It returns true if both strings are same in content, ignoring uppercase/lowercase.
         */
    }
}
