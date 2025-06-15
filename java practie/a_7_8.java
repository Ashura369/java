// take the array as an input, and Reverse print it 
import java.util.*;
public class a_7_8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number of arrays you want : ");
        int size = input.nextInt();

        int[] arr=new int[size];

        // input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter element "+(i+1)+" : ");
            arr[i] = input.nextInt();
        }

        // output
        for (int i = (arr.length - 1); i >= 0; i--) {
            System.out.println("value at element "+i+" is -- "+arr[i]);
        }
    }
}
