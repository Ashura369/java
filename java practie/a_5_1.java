/*
Print the patterns

*
**
***
****
*****
****
***
**
*

*/


public class a_5_1 {
    public static void main(String[] args) {
        int rows = 5;

        // Ascending part of the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Descending part of the pattern
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



