// Find the maximum number in an array

import java.util.*;
public class a_7_3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,66,7,8,9,10};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print("the maximum number is : "+max);
    }
}
