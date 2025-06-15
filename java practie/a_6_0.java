// enter 3 numbers from the user & make a function to print the greatest number

import java.util.*;
public class a_6_0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter 3 numbers : ");

        int a1=sc.nextInt();
        int b1=sc.nextInt();
        int c1=sc.nextInt();

        String result = process(a1,b1,c1);
        System.out.println(result);
    }

    public static String process(int a, int b, int c) {
        
        // if (a>b && a>c) {
        //     System.err.println(a+" is greater");
        // }else if(b>a && b>c){
        //     System.err.println(b+" is greater");
        // }else {
        //     System.err.println(c+" is greater");
        // }

        /*
        int max = Math.max(a, Math.max(b, c));
        System.err.println(max + " is greatest"); 
        */

        String big=(a>b && a>c) ? a+" is greater" :(b>a && b>c) ? b+" is greater" : c+" is greater";
        return big+ " is greatest";
    }
}
