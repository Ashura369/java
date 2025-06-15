// dis-sorted and recurring array - fix it

import java.util.*;

public class a_7_14 {
    public static void main(String[] args) {
        int[] arr = {13, 5, 7, 2, 9, 5, 12, 4, 8, 7, 1, 3, 9, 6, 14, 2, 11, 6, 10, 8};

        // Sort the array
        Arrays.sort(arr);

        // Printing the sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // printing each value once only
        System.out.println("Unique Elements:");
        System.out.print(arr[0] + " "); 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) { ////cehcks if the current element of the array is different from the previous one or not, if yes then print it
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println();

        // print the new array without sorting it, excluding the repetative numbers
        System.out.println("Printing the arrays without sorting it --> ");
        process(); 
    }

    public static void process() {
        int[] arr = {13, 5, 7, 2, 9, 5, 12, 4, 8, 7, 1, 3, 9, 6, 14, 2, 11, 6, 10, 8};

        // removing the repetations
        for (int i = 0; i < arr.length; i++) {
            boolean repeat = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    repeat = true;
                    break;
                }
            }

            if (!repeat) {
                System.out.print(arr[i]+" ");
                
            }
        }

    }
}
