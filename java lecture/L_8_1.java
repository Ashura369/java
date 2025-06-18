/*
    Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs
*/


import java.util.*;
public class L_8_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ROWS : ");
        int row = input.nextInt();
        System.out.print("ENTER THE NUMBER OF COLUMNS : ");
        int column = input.nextInt();

        int[][] arr = new int[row][column];

        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.print("ENTER THE NUMBER YOU WANT TO SEACH FOR : ");
        int n = input.nextInt();

        // output
        boolean found = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] == n) {
                    System.out.println("AT NUMBER "+n+" THE ROW IS "+i+" AND THE COLUMN IS "+j);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("PLEASE ENTER A VALID NUMBER");
        }

    }
}
