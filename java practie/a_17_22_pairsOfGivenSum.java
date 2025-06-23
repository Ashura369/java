// Find all pairs of elements whose sum is equal to a given value.

import java.util.*;

public class a_17_22_pairsOfGivenSum {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 5, 6, -1 };
        int sum = 5;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
                }
            }
        }

        // the code above will print the same pairs multiple times, so the code below is a better option
        betterAns();

    }

    public static void betterAns() {
        int[] arr = { 4, 7, 1, 3, 5, 9, 2, 8, 5, 5, 6, 4 };
        int targetSum = 10;

        Arrays.sort(arr); // now arr = {1, 2, 3, 4, 4, 5, 5, 5, 6, 7, 8, 9}
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i]+", ");
        // }

        System.out.println("Unique pairs with sum " + targetSum + ":");
        for (int i = 0; i < arr.length - 1; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue; // now the arr is = {1, 2, 3, 4, 5, 6, 7, 8}
            // System.out.print(arr[i]+", ");

                    /*
                        for (int i = 1; i <= 5; i++) {
                            if (i == 3) {
                                continue; // skips i = 3
                            }
                            System.out.print(i + " ");
                        }

                        OUTPUT --> 1, 2, 4, 5
                    */

            for (int j = i + 1; j < arr.length; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1])
                    continue;
                    
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("("+arr[i]+", "+arr[j]+")"+" = "+targetSum);
                } else if (arr[i] + arr[j] > targetSum) {
                    break;
                }
            }
        }
    }
}
