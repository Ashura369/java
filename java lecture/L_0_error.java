
import java.util.*;
public class L_0_error {
   
    static final int N = 4;

    public static void main(String[] args) {
        int[][] board = new int[N][N];
        solveNQueens(board, 0);
    }

    static void solveNQueens(int[][] board, int row) {
        if (row == N) {
            // print the board
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int col = 0; col < N; col++) {

            // Inline "isSafe" check here instead of a separate method
            boolean safe = true;

            // check column above
            for (int i = 0; i < row; i++) {
                if (board[i][col] == 1) {
                    safe = false;
                    break;
                }
            }

            // check upper left diagonal
            for (int i = row - 1, j = col - 1; safe && i >= 0 && j >= 0; i--, j--) {
                if (board[i][j] == 1) {
                    safe = false;
                    break;
                }
            }

            // check upper right diagonal
            for (int i = row - 1, j = col + 1; safe && i >= 0 && j < N; i--, j++) {
                if (board[i][j] == 1) {
                    safe = false;
                    break;
                }
            }

            if (safe) {
                board[row][col] = 1;  // place queen
                solveNQueens(board, row + 1);  // next row
                board[row][col] = 0;  // backtrack
            }
        }
    }
}
    
    
}

