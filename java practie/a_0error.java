import java.util.*;

public class a_0error {
    public static void main(String[] args) {
        String str = "qczfxxvmyuhrokwaxnpbldexxtsagxjaixegtc";
        char[] arr = str.toCharArray();
        
        bubbleSortRecursive(arr, arr.length, 0);

        System.out.println(new String(arr)); // print sorted string
    }

    // Recursive bubble sort
    public static void bubbleSortRecursive(char[] str, int n, int idx) {
        // base case: if only one element left, it's sorted
        if (n == 1) {
            return;
        }

        // one pass
        if (idx < n - 1) {
            if (str[idx] > str[idx + 1]) {
                // swap
                char temp = str[idx];
                str[idx] = str[idx + 1];
                str[idx + 1] = temp;
            }
            bubbleSortRecursive(str, n, idx + 1); // continue current pass
        } else {
            // one full pass done, reduce the size and repeat
            bubbleSortRecursive(str, n - 1, 0);
        }
    }
}
