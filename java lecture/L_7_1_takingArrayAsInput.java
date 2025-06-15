import java.util.*;
public class L_7_1_takingArrayAsInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("enter number of values you want to put : ");
        int size = input.nextInt();
        int[] numbers=new int [size];

        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
        
        /*
        keep in mind you still haven't put any values in the arrays. You just have entered the no. of values the array will take.

        If you don't enter any values then it will automatically put different values as per their variable data type.
            int = 0
            float = 0.0
            boolean = false
            string = " "

            Try changing the data types, and you will see the changes.
        */
    }

}
