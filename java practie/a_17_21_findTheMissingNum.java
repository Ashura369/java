// finding the missing num from the arr (the arr must be in a chronological order)

import java.util.*;

public class a_17_21_findTheMissingNum {
    public static void main(String[] args) {
        int[] arr = { 11, 3, 14, 1, 7, 13, 5, 2, 15, 8, 6, 4, 10, 12 };

        // sorting the array
        Arrays.sort(arr);

        // assuming common difference from first 2 elements
        int commonDiff = arr[1] - arr[0];

        // loop till second last index to prevent out-of-bounds error
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff != commonDiff) {
                System.out.println("The difference between " + arr[i] + " and " + arr[i + 1] + " is " + diff);
                System.out.println("Hence the missing number is: " + (arr[i] + commonDiff));
                break; // stop after finding first missing number
            }
        }
        System.out.println();
        System.out.println("---------------------------------------------------");
        
        // THE ABOVE CODE IS THE CHILDISH WAY TO WRITE THIS CODE, THIS CODE WILL NOT RUN
        // IF THERE IS ANY MISMATCH OF THE COMMON DIFF IN BTWN THE CODE.
        // SO THE BELOW FUNCTION IS THE PROPER WAY TO WRITE THE CODE
        betterApproach();
    }

    public static void betterApproach() {
        int[] arr = { 12, 5, 1, 18, 3, 9, 20, 2, 7, 4, 13, 11, 15, 21, 17, 8, 10, 19, 16, 6 };

        Arrays.sort(arr); // 🔧 VERY IMPORTANT: sort the array first

        int diff = 0;
        int commonDiff = 0;

        // determine the common difference
        for (int i = 0; i < arr.length - 2; i++) {
            int d1 = arr[i + 1] - arr[i];
            int d2 = arr[i + 2] - arr[i + 1];

            if (d1 == d2) {
                commonDiff = d1;
                break;
            }
        }

        
        // now detect the mismatch
        int missing = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            diff = arr[i + 1] - arr[i];

            if (diff != commonDiff) {
                missing = arr[i] + commonDiff;

                System.out.println("ERROR: this number is not in consecutive order");
                System.out.println("The odd difference is " + diff);
                System.out.println("Mismatch found between " + arr[i] + " and " + arr[i + 1]);
                System.out.println("The missing number is: " + missing);
                break; // optional: break if only one missing number
            }
        }
    }
}
