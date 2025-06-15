// shortest way to write if else

import java.util.Scanner;

public class a_3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String evenOdd = (number % 2 == 0) ? "even" : "odd"; //here we are storing "even"/"odd" in "evenOdd", which are strings. That's why we stored them as string

        String comparison = (number > 10) ? "greater than 10" : "less than 10";

        // Display the results
        System.out.println(number + " is " + evenOdd + " and " + comparison + ".");

        input.close();
    }
}
