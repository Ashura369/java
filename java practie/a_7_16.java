// Finding Largest & Second largest element

import java.util.*;

public class a_7_16 {
    public static void main(String[] args) {
        int[] arr = {13, 5, 7, 2, 9, 5, 12, 4, 8, 7, 1, 3, 9, 6, 14, 2, 11, 6, 10, 8};

        // int arr[i] = arr[0];s
        int largest = arr[0];
        int secondLargest = arr[0];

        // finding the largest elements
        for (int i = 1; i < arr.length; i++) {


            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest number is: " + largest);
        System.out.println("Second largest number is: " + secondLargest);
    }
}
