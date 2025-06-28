/*
rearrange the arr in 

positive, negative, positive, negative, ...
or 
negative, positive, negative, positive, ...
*/

import java.util.*;
public class a_17_23_rearrangePositiveToNegativeOrViceVersa {
    public static void main(String[] args) {
        int[] arr = {5, -8, -3, 7, -1, 10, -6, -9, 4, -5, 2, -2, -4, 11, 8};
        // int positive=0;
        // int negative=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                int positive = arr[i];
            }else{
                int negative = arr[i];
            }

            for (int j = 0; j < arr.length; j++) {
                
            }
        }
    }
}
