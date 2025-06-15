import java.util.*;

public class L_7_1_0 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("enter number of values you want to put : ");
        int size = input.nextInt();
        int[] numbers=new int [size];

        // getting input
        System.out.println("enter all the values --> ");
        for (int i = 0; i < size; i++) {
            numbers[i]=input.nextInt();
        }

        // getting output
        for (int i = 0; i < size; i++) {
            System.out.println("ELEMENT "+(i+1)+" OF THE ARRAY IS : "+numbers[i]);
        }
        input.close();
    }
}

/*
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }

        // getting output
        for (int i = 0; i < arr.length; i++) {
            System.out.println("ELEMENT "+(i+1)+" OF THE ARRAY IS : "+arr[i]);
        }
 */
