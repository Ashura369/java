/*
print this  -->

    *
   **
  ***
 ****
*****

*/

public class a_5_7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { 
            for (int j = 1; j <= 5-i; j++) { // (j<=5-i) The number of spaces decreases by one with each subsequent row.
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Row 1 (i = 1):
    Spaces: 5 - 1 = 4 → " "
    Asterisks: 1 → "*"
    Output: " *"

Row 2 (i = 2):
    Spaces: 5 - 2 = 3 → " "
    Asterisks: 2 → "**"
    Output: " **"

Row 3 (i = 3):
    Spaces: 5 - 3 = 2 → " "
    Asterisks: 3 → "***"
    Output: " ***"

Row 4 (i = 4):
    Spaces: 5 - 4 = 1 → " "
    Asterisks: 4 → "****"
    Output: " ****"

Row 5 (i = 5):
    Spaces: 5 - 5 = 0 → ""
    Asterisks: 5 → "*****"
    Output: "*****"

*/
