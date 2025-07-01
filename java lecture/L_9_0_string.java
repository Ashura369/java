// learning string

import java.util.*;
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

   }
}
