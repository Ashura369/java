//print the table of a number "n" input by the user

import java.util.*;

public class a_4_3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n, i;
        System.out.print("ENTER THE NUMBER : ");
        n=sc.nextInt();

        System.out.println("THE TABLE OF "+n+" is : ");
        for(i=1; i<=10; i++){
            System.out.println(n+ " x "+i+" = "+i*n);
        }
    }
}
