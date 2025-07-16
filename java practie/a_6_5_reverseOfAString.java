// returning reverse of a string

import java.util.*;
public class a_6_5_reverseOfAString {
    public static void main(String[] args) {
        reverse();
    }

    public static String reverse() {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = input.nextLine();

        String newStr = new StringBuilder(str).reverse().toString();
        System.out.println("The reversed string is: "+newStr);
        return newStr;

    }
}
