// finding the smallest number in the array
import java.util.*;
public class a_7_4 {
    public static void main(String[] args) {
        
        int[] arr={9,8,5,63,0,9,76,26,97};
        int min=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                // System.out.println("current min is - "+min);
            }
        }

        System.out.print("THE SMALLEST NUMBER IS : "+min);
    }
}
