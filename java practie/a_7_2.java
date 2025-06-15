// take an array as input from the user. Srarch for a given number X and print the index at which it occurs.

import java.util.*;

public class a_7_2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // array
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.print("ENTER THE NUMBER BETWEEN 1 TO 10 TO KNOW ITS INDEX: ");
        int n = input.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("THE ARRAY INDEX OF NUMBER " + n + " IS: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("ERROR: NUMBER NOT FOUND IN ARRAY");
        }
    }
}

