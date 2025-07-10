// inserting a word into the string

public class a_9_9_insertingWord {
    public static void main(String[] args) {
        String txt = "Hello i am from Odisha.";

        // Print index and character for reference (helps in finding insert position)
        for (int i = 0; i < txt.length(); i++) {
            System.out.println(i + ": " + txt.charAt(i));
        }

        // String does not support insert() directly. 
            // To insert text, we first convert it into a StringBuilder. You can't directly insert the method into the string, bcoz strings are immutable
        StringBuilder sb = new StringBuilder(txt);
        sb.insert(10, " Jeet, and");  // Inserting text at index 10

        System.err.println(sb); // Printing as StringBuilder (same output but different type)
        System.out.println(sb.toString()); // Converting to String and printing
    }
}
