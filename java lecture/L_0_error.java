// dis-sorted and recurring array - fix it
import java.util.*;
public class L_0_error {
   
    public static void main(String[] args) {
        int[] arr = {13, 5, 7, 2, 9, 5, 12, 4, 8, 7, 1, 3, 9, 6, 14, 2, 11, 6, 10, 8};

        Arrays.sort(arr);
        
        // sorting the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        // now the arry is arr = {1 2 2 3 4 5 5 6 6 7 7 8 8 9 9 10 11 12 13 14 }
        System.out.println();

        // printing each value once only
        System.out.print(arr[0]+" ");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) { //cehcks if the current element of the array is different from the previous one or not, if yes then print it
                System.out.print(arr[i]+" ");   
            }
        }

    }
    
}

