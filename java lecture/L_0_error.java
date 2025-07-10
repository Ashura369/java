// dis-sorted and recurring array - fix it
import java.util.*;
public class L_0_error {
   
    public static void main(String[] args) {
        String word = "madam";
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println("PALINDROME");
        }

    }
    
}

