public class a_15_1_nQueens {
    // it will be a N x N chessboard
    // N will be given in the qs
        // N = 4
    // print all the solutions where queens are safe



    // keep one thing in mind, when we wil be placing a queen at a cell we will be putting 1
    // and when there will be no queen in any cell or will be removing any queen from any cell we will be putting 0

   static final int N = 4; 

    public static void main(String[] args) {

        int[][] board = new int[N][N]; // the board here is an array

        solveNQueens(board, 0);
    }

    // printing the entire board
    static void printBoard(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // checking if the queen's position is safe or not
    static boolean isSafe(int[][] board, int row, int col) {

        // 1st loop — checking the same column above the current row
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) { //  if there’s already a queen in the same column above the current row, return false     // when row = 0, this code doesn't run at all (neither of the loop in this function will run when row = 0)
                return false;   // the loop will run until it finds a position where it finds the queen, once it finds the queen it will return false, if it doesn't find any queen then the loop will end when it reaches i < row and then it will start running the next line of loops below it
            }
        }

        // 2nd loop — checking the upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // 3rd loop — checking the upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true; 
    }


    static void solveNQueens(int[][] board, int row) {
        if (row == N) {
            printBoard(board); 
            System.out.println();
            return;
        }

        // It tries all possible column positions for the queen in the current row.
        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) { // if isSafe function doesn't return "true" then the code below will not run, this is bcoz in the isSafe function the code is returning true. So returning true is like a condition here
                board[row][col] = 1;

                solveNQueens(board, row + 1);

                board[row][col] = 0;
            }
        }
    }     
}
