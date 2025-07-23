// check the array is sorted or not (strictly increasing)
import java.lang.reflect.Array;
import java.util.*;
public class a_13_13_0_sortArray {
    public static void main(String[] args) {
        int[] arr = {1,3,6,2,4,2,5,9};
        r1(arr, arr.length); // first -- sorting the arr using bubble sort 
        System.out.println("THE SORTED ARRAY IS : "+ Arrays.toString(arr));

        r2(arr, 0); // second -- printing the array in increasing order
        System.out.println();
        r3(arr, 0); // third -- printing the array in strictly increasing order
    }

    public static void r1(int[] arr, int n) {
        if (n == 1) {
            return;
        }

        for (int i = 0; i < (n-1); i++) {
            if (arr[i] > arr[i+1]) {
                // using swap
                int temporary = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temporary;
            }
        }

        r1(arr, n-1);
    }

    public static void r2(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }

        System.out.print(arr[idx] + " ");
        r2(arr, idx+1);
    }

    public static void r3(int[] arr, int idx) {
        
        if (idx == arr.length) {
            return;
        }

        if (idx == 0 || arr[idx] != arr[idx - 1]) { // try solving the logic with the negative statements
            System.out.print(arr[idx] + " ");
        }

        r3(arr, idx+1);     
        
        /*
            (idx == 0 || arr[idx] != arr[idx - 1])

            Here one thing keep in mind that, if the first condition in the or statement goes right or goes valid, then java doesn't bother checking the another condition. It immediately jumps to the next line of the code

            That means java here is only checking for the conditon, so as in the first iteration is idx = 0, so the condition goes true. And java jumps to the next line of the code. It doesn't even check the next condition, even if it is invalid if idx is 0 in first. Bcoz "idx - 1" would be -1 in the next condition when idx is 0.

        */


    }


}
