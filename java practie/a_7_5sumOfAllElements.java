// Calculate the sum of all array elements
import java.util.*;
public class a_7_5sumOfAllElements {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};

        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print("sum of the array is : "+sum);
    }
}
