// 2D Array
/*

    Copilot said: A **2D array** (two-dimensional array) is an
    A 2D array (two-dimensional array) is an array of arrays. It’s like a table with rows and columns, where each element is accessed by two indices: one for the row and one for the column.

    - A 2D array is a way to store data in a grid or matrix form.
    - Each position in a 2D array is identified by two indices: [row][column].
    - It’s commonly used for representing things like matrices, game boards (chess, tic-tac-toe), or tables of data.

    Syntax -- 
        type[][] arrayName = new type[rows][columns];
        e.g. -- int[][] numbers = new int[3][5];


 */

import java.util.*;
public class L_8_0_2DArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("ENTER THE NUMBER OF ROWS: ");
        int rows = input.nextInt();
        System.out.print("ENTER THE NUMBER OF COLUMNS:  ");
        int columns = input.nextInt();
        System.out.println("--- ENTER THE 2D ARRAY ---");

        int[][] numbers = new int[rows][columns];

        // input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = input.nextInt();
            }
        }

        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }

    }
}
