import java.util.*; //this is ust a package, there are multiple packages like it. You will learn about them soon
/*
Purpose: This line imports all classes from the 'java.util' package, including the Scanner class.

Explanation: The 'Scanner' class is part of the java.util package, which provides utility classes for handling data structures, date and time facilities, and more. By importing java.util.*, you make all classes in this package available to your program.

'*' -- In Java, the asterisk (*) in an import statement is used as a wildcard to import all classes from a specific package


*/


public class L_2_2_takingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //"System.in" takes strings/numbers as input // "sc" is an object here
        String name = sc.next(); //here we have stored the input in "name"
        System.out.println(name);
    }
}
/*
"Scanner sc = new Scanner(System.in);"
    Purpose: Creates a "Scanner" object named sc to read input from the standard input stream (keyboard).

    Explanation: The Scanner class is used to parse primitive types and strings using regular expressions. "System.in" refers to the standard input stream, typically the keyboard. By passing System.in to the Scanner constructor, you're enabling the program to read user input. 

"String name = sc.next();"
    The "next()" method of the Scanner class reads input until it encounters a space. This means if the user enters "John Doe", only "John" will be stored in the name variable. To read the entire line, including spaces, you can use the "nextLine()" method instead.

    -nextLine()
    -nextInt()
    -nextFloat(), etc

*/