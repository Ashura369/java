// make  a function to multiply two numbers and return the sum

import java.util.*;
public class L_6_2_multiply {

    public static int calculate (int a, int b) {
        return a*b;
        //here rather than storing a*b into a multiply variable, we directly passed the value into return 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("enter a : ");
        int a=sc.nextInt();
        System.out.print("enter b : ");
        int b=sc.nextInt();

        // int multiply=calculate(a, b);
        System.out.println("the multiply of "+a+" and "+b+" is : "+calculate(a, b));

    }
}
