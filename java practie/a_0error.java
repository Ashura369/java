// find the missing number

import java.util.*;

public class a_0error {
    public static void main(String[] args) {

        int[] arr = { 4, 7, 1, 3, 5, 9, 2, 8, 5, 5, 6, 4 };
        int sum = 10;

        Arrays.sort(arr); // now arr = {1, 2, 3, 4, 4, 5, 5, 5, 6, 7, 8, 9}
            // for (int i = 0; i < arr.length; i++) {
            //     System.out.print(arr[i]+", ");
            // }

        for (int i = 0; i < arr.length-1; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue; // now the loop is arr = {1, 2, 3, 4, 5, 6, 7, 8}
            // System.out.print(arr[i]+", ");

            for (int j = i + 1; j < arr.length; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1])
                    continue;
                    
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + targetSum);
                } else if (arr[i] + arr[j] > targetSum) {
                    break;
                }

            for (int j = (i+1); j < arr.length; j++) {
                
                if (arr[i] + arr[j] == sum) {
                    System.out.println("("+arr[i]+", "+arr[j]+")"+" = "+sum);
                }else if (arr[i]+arr[j] > sum) {
                    break;
                } 

            }            
        }        
    }
}
