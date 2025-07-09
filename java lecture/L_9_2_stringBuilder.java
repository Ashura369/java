public class L_9_2_stringBuilder {
    public static void main(String[] args) {
        
        // string builder

        StringBuilder text = new StringBuilder("Jeet");
        System.out.println(text);

        // char at index 0 
        System.out.println(text.charAt(0));

        // set char at index 0
            // this is used to replace the characters
        text.setCharAt(0, 'P'); // KEEP IN MIND THAT YOU CAN ONLY USE '' SINGLE INVERTED COMMA HERE, YOU CAN'T USE DOUBLE INVERTED COMMA ""
        System.out.println(text); // Peet
        System.out.println();

        // insert
            // used to insert new characters
        text.insert(0, "HII ");
        System.out.println(text); // HII Peet
        System.out.println();

        text.insert(8, " is goodlooking");
        System.out.println(text); // HII Peet is acidic
        System.out.println();

        // replace
        text.replace(4, 8, "Jeet"); // will replace the text from index 4 to index 8
        System.out.println(text);
        System.out.println();

        // delete
        text.delete(12, 23); // here the ending index is non-inclusive, it means that even if the ending index is 22, you have to put 23 so it can keep deleting till 22nd index
        System.out.println(text);


    }
}
