// checking if a string is palindrome or not

public class a_9_11_checkPalindrome {
    public static void main(String[] args) {
        String word = "madam";

        boolean palindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length()-1-i)) { // (word.charAt(i) != word.length()-1-i) --> if you write this statement then you are just comparing a character (word.charAt(i)) with an integer (word.length() - 1 - i), which is incorrect.
                palindrome = false;
                break; // break here is to stop the further execution of the loop once the condition is satisfied
            }
        }

        if (palindrome) {
            System.out.println("PALINDROME");
        }else{
            System.out.println("NOT PALINDROME");
        }

        System.out.println();
        better();
    }


    public static void better() {
        String word = "madam";
        String reversed = new StringBuilder(word).reverse().toString(); 
            // this line first converst the string into a StringBuilder, and then reverse it, and then again converts it into a string, and stores it into a string object called "reversed"

        if (word.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
