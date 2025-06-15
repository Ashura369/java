// printing array using while loop

import java.util.*;
public class a_7_1_0 {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF ARRAY : ");
        int size = input.nextInt();

        int[] arr=new int[size];

        // input
        int i=0;
        System.out.println("ENTER "+size+" NUMBERS TO ASSIGN");
        while (i < arr.length) {
            System.out.print("ENTER ELEMENT "+(i+1)+" OF THE ARRAY : ");
            arr[i]=input.nextInt();
            i++;
        }

        // output
        i=0;
        while (i < arr.length) {
            System.out.println("ELEMENT "+(i+1)+" OF THE ARRAY IS : "+arr[i]);
            i++;
        }

        input.close();


    }
}
