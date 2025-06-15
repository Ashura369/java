// printing in array using do while loop

import java.util.*;
public class a_7_1_1 {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF THE ARRAY : ");
        int size=input.nextInt();
        int[] arr=new int[size];

        System.out.println("ENTER "+size+" ELEMENTS");

        int i=0;
        do {
            System.out.print("ELEMENT "+(i+1)+" OF THE ARRAY IS : ");
            arr[i]=input.nextInt();
            i++;
        } while (i < arr.length);

        i=0;
        System.out.println("ARRAYS ARE --> ");
        do {
            System.err.println("ELEMENT "+(i+1)+" OF THE ARRAY IS : "+arr[i]);
            i++;
        } while (i < arr.length);

    }
}
