/**
 * 
 */
package backtracking;

/**
 * 
 */
public class SudokuSolver {
	static int check = 0;

	public static boolean isValid(char board[][], int row, int col, char num) {
		int n = board.length;
		// check row
		for (int j = 0; j < n; j++) {
			if (board[row][j] == num)
				return false;
		}
		// check column
		for (int i = 0; i < n; i++) {
			if (board[i][col] == num)
				return false;
		}
		// check 3x3 grid
		int sRow = row / 3 * 3;
		int sCol = col / 3 * 3;
		for (int i = sRow; i < sRow + 3; i++) {
			for (int j = sCol; j < sCol + 3; j++) {
				if (board[i][j] == num)
					return false;
			}
		}
		return true;
	}

	public static void solve(char[][] board, int row, int col) {
		int n = board.length;
		if (row == n) {
			check = 1;
			return;
		}
		if (board[row][col] != '.') { // call
			if (col != n - 1)
				solve(board, row, col + 1);
			else
				solve(board, row + 1, 0);
		} else { // board[row][col]=='.'
			for (char ch = '1'; ch <= '9'; ch++) {
				if (isValid(board, row, col, ch)) {
					board[row][col] = ch;
					if (col != n - 1)
						solve(board, row, col + 1);
					else
						solve(board, row + 1, 0);
					if (check == 1)
						return;
					board[row][col] = '.';
				}
			}
		}
	}

	public static void solveSudoku(char[][] board) {
		solve(board, 0, 0);
	}

	public static void printGrid(char[][] board) {
		int n = board.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char board[][] = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		System.out.println("Unsolved Sudoku is :-");
		printGrid(board);
		solveSudoku(board);
		System.out.println("Solved Sudoku is :-");
		printGrid(board);

	}

}
