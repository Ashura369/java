// Write a Java program that prompts the user to enter a number and determines whether the number is positive, negative, or zero.

import java.util.*;
public class a_3_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("enter the number : ");
        int a=input.nextInt();

        String num = (a > 0) ? "POSITIVE" : (a < 0) ? "NEGATIVE" : "ZERO";
        System.out.println("the number "+a+" is a "+num+" integer ");
    }
}
