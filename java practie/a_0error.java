// find the missing number

import java.util.*;

public class a_0error {
    public static void main(String[] args) {

        int[] arr = { 11, 3, 14, 1, 7, 13, 5, 2, 15, 8, 6, 4, 10, 12 };
        Arrays.sort(arr);

        int diff = 0;
        int commonDiff=0;

        // getting the differences
        for (int i = 0; i < arr.length - 2; i++) {
            int d1=arr[i+1] - arr[i];
            int d2=arr[i+2] - arr[i+1];

            if (d1 == d2) {
                commonDiff = d1;
                break;
            }
        }

        // output
        for (int i = 0; i < arr.length-1; i++) {
            diff = arr[i+1] - arr[i];

            if (diff != commonDiff) {
                int missing = arr[i] + commonDiff;

                System.out.println("the missing num is : "+missing);
                System.out.println("the difference is : "+diff);
            }

        }

    }
}
