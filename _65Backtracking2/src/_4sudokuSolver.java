public class _4sudokuSolver {

    public static void main(String[] args) {

        // Initial Sudoku board where '.' means an empty cell
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        // Solve the Sudoku puzzle
        solveSudoku(board);

        // Print the solved board
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    // Wrapper function to solve Sudoku
    public static void solveSudoku(char[][] board){
        int n = board.length; // size of board (9x9)

        // Create an empty grid to store the final solved board
        char[][] grid = new char[n][n];

        // Start solving from cell (0,0)
        solve(board, 0, 0, grid);

        // Copy the solved grid back to the original board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = grid[i][j];
            }
        }
    }

    // Recursive function to solve the Sudoku using backtracking
    private static void solve(char[][] board, int row, int col, char[][] grid) {
        int n = board.length;

        // Base case: if we’ve filled all rows, store the solved board into grid
        if (row == n){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = board[i][j];
                }
            }
            return; // stop recursion
        }

        // If the current cell is already filled, move to the next cell
        if (board[row][col] != '.') {
            if (col != n - 1) // move to next column
                solve(board, row, col + 1, grid);
            else // move to next row
                solve(board, row + 1, 0, grid);
        }
        else {
            // Try placing digits '1' to '9' in the empty cell
            for(char ch = '1'; ch <= '9'; ch++){
                if(isValid(board, row, col, ch)){ // check if placement is valid
                    board[row][col] = ch; // place the number

                    // Move to next cell
                    if (col != n - 1)
                        solve(board, row, col + 1, grid);
                    else
                        solve(board, row + 1, 0, grid);

                    // Backtrack: reset the cell for the next possibility
                    board[row][col] = '.';
                }
            }
        }
    }

    // Function to check if placing a number is valid according to Sudoku rules
    private static boolean isValid(char[][] board, int row, int col, char num) {
        int n = board.length;

        // Check the row for the same number
        for (int j = 0; j < n ; j++) {
            if (board[row][j] == num) return false;
        }

        // Check the column for the same number
        for(int i = 0; i < n; i++) {
            if (board[i][col] == num) return false;
        }

        // Check the 3x3 sub-grid for the same number
        int sRow = row / 3 * 3; // starting row of sub-grid
        int sCol = col / 3 * 3; // starting col of sub-grid
        for (int i = sRow; i < sRow + 3; i++) {
            for (int j = sCol; j < sCol + 3; j++){
                if (board[i][j] == num) return false;
            }
        }

        // If no conflicts found, placement is valid
        return true;
    }
}
