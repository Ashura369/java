public class L_9_0_string {
    public static void main(String[] args) {
        // string declaration
        String name = "Jeet";
        String fullName = "Biswajeet Pradhan";

        // taking string as an input
        // System.out.print("ENTER YOUR NAME : ");
        // Scanner input=new Scanner(System.in);
        // String name2 = input.nextLine();
        // System.out.println("YOUR NAME IS : "+name2);
        // System.out.println();

        // Concatination
        String firstName = "Biswajeet";
        String lastName = "Pradhan";
        String completeName = firstName + " " + lastName;
        System.out.println("THE COMPLETE NAME IS : "+completeName);
        System.out.println();

        // Length
        System.out.println("THE LENGTH OF THE COMPLETE NAME IS : "+completeName.length()); // keep in mind that "stringName.length" also takes white spaces as length. Your name is of 16 letters but it will print as 17 letters bcoz it has taken the white space as string length
        System.out.println();

        // charAt - YOU CAN USE THIS FUNCTION FOR STRING ONLY, YOU CAN'T USE THIS ON ARRAY
        for (int i = 0; i < completeName.length(); i++) {
            System.out.println("LETTER AT INDEX "+i+ " IS - " +completeName.charAt(i));
        }
        System.out.println();

        // compareTo - Comparing Strings
        String n1 = "jeet";
        String n2 = "jeet";

        if (n1.compareTo(n2) == 0) {
            System.out.println("STRINGS ARE EQUAL");
        }else{
            System.out.println("STRINGS ARE NOT EQUAL");
        }
        System.out.println();

                /*
                
                n1 == n2

                    Compares object references (memory addresses), not the actual text inside the strings.
                    It only returns true if both n1 and n2 refer to the exact same String object in memory.

                    Example:
                    String a = new String("hello");
                    String b = new String("hello");
                    System.out.println(a == b); // false


                n1.compareTo(n2) == 0 (or n1.equals(n2))

                    Compares the actual sequence of characters in the strings.
                    Returns true if the contents (text) of both strings are exactly the same, regardless of whether they are different objects.
                    
                    Example:
                    String a = new String("hello");
                    String b = new String("hello");
                    System.out.println(a.equals(b));           // true
                    System.out.println(a.compareTo(b) == 0);   // true


                */
        
        // substring
        // The substring method in Java is used to extract a part (subsequence) of a string, i.e., to get a smaller string from a larger one.
        String sentence = "My name is Jeet";
        String nm = sentence.substring(11, sentence.length()); //originalString.substring(startIndex, endIndex);
            // startIndex (inclusive): the index where the substring starts.
            // endIndex (exclusive): the index where the substring ends.
            // it will skip the first 11 index of the string, and from then on it will print till end of the string. Instead of using ".string()" you can use a number also

        String nm2 = sentence.substring(3); // if you dont put any endingIndex then it will by default take the last index as the endingIndex
        
        System.err.println(nm);
        System.err.println(nm2);
        

        // STRINGS ARE IMMUTABLE
        // Once a string is created it's value can't be changed
        /*
            String name = "Alice";
            name = name + " Smith";

            System.out.println(name);

         */
        
    }
}
