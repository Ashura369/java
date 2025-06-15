// make  a function to add two numbers and return the sum

import java.util.*;
public class L_6_1_sum {
    public static int calculate(int a, int b) {
        int sum = a+b;
        // System.out.print("the sum is : " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("1st number : ");
        int a = input.nextInt();
        System.out.print("2nd number : ");
        int b = input.nextInt();

        int sum = calculate(a, b);
        System.out.println("the sum is : " + sum);

    }

}
