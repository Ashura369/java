/*
Print the patterns

******
 ****
  **
 ****
******

(EXTREME DIFFICULTY)

*/


public class a_5_4 {
    public static void main(String[] args) {
        int n = 6; // Total number of columns

        // First half of the pattern
        for (int i = 0; i < n / 2; i++) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 0; j < n - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Second half of the pattern
        for (int i = n / 2 - 1; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int j = 0; j < n - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

