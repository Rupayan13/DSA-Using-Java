/**
 * 
 */
package backtracking;

/**
 * 
 */
public class MaxKnightsInNxMBoard {
	static int maxKnights = -1;
	static int number = 8;

	public static boolean isSafe(char[][] board, int row, int col) {
		int n = board.length;
		int i, j;
		// 2 Up 1 left
		i = row - 2;
		j = col - 1;
		if (i >= 0 && j >= 0 && board[i][j] == 'k')
			return false;
		// 2 Up, 1 Right
		i = row - 2;
		j = col + 1;
		if (i >= 0 && j < n && board[i][j] == 'k')
			return false;
		// 2 Down 1 left
		i = row + 2;
		j = col - 1;
		if (i < n && j >= 0 && board[i][j] == 'k')
			return false; // 2 Down, 1 Right
		i = row + 2;
		j = col + 1;
		if (i < n && j < n && board[i][j] == 'k')
			return false;
		// 2 Left, 1 Up
		i = row - 1;
		j = col - 2;
		if (i >= 0 && j >= 0 && board[i][j] == 'k')
			return false; // 2 Left, 1 Down
		i = row + 1;
		j = col - 2;
		if (i < n && j >= 0 && board[i][j] == 'k')
			return false;
		// 2 Right, 1 Up
		i = row - 1;
		j = col + 2;
		if (i >= 0 && j < n && board[i][j] == 'k')
			return false; // 2 Right, 1 Down
		i = row + 1;
		j = col + 2;
		if (i < n && j < n && board[i][j] == 'k')
			return false;
		return true;
	}

	public static void nKnights(char[][] board, int row, int col, int num) {
		int n = board.length;
		if (row == n) {
			if (num == number) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						System.out.print(board[i][j]);
					}
					System.out.println();
				}
				System.out.println();
			}
			maxKnights = Math.max(num, maxKnights);
			return;
		} else if (isSafe(board, row, col)) {
			board[row][col] = 'k';
			if (col != n - 1)
				nKnights(board, row, col + 1, num + 1);
			else
				nKnights(board, row + 1, 0, num + 1);
			board[row][col] = 'x';
		}
		if (col != n - 1)
			nKnights(board, row, col + 1, num);
		else
			nKnights(board, row + 1, 0, num);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		char board[][] = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = 'x';
			}
		}
		nKnights(board, 0, 0, 0);
		System.out.println(maxKnights);

	}

}
