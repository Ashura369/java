// find the frequency of each number

import java.util.*;

public class a_0error {

    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 2, 5, 3, 8, 7, 1, 4, 9, 6, 2, 10, 5};

        // calculating the frequency
        int freq = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }

            }
            System.out.println("FREQUENCY OF NUM "+arr[i]+" IS "+freq);
        }
        

    }

}