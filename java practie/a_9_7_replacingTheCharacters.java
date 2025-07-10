// replacing the characters

public class a_9_7_replacingTheCharacters {
    public static void main(String[] args) {
        
        String a = "Hello my name is jeet. I am from Odisha";
        
        for (int i = 0; i < a.length(); i++) {
            System.err.println(i + ": "+ a.charAt(i));
        }

        // replacaing words
        String replaced = a.replace("jeet", "Ashura");

        // replacing characters (letters)
        String replaced2 = a.replace('e', 'd');

            // ALWAYS KEEP IN MIND THAT WHEN YOU ARE REPLACING WORDS YOU HAVE TO USE " " (DOUBLE INVERTED COMMAS), 
            // AND WHEN YOU ARE REPLACING THE LETTERS YOU HAVE TO USE ' ' (SINGLE INVERTED COMMAS)

        System.err.println(replaced);
        System.err.println(replaced2);



    }
}
