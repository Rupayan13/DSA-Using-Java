/**
 * 
 */
package backtracking;

/**
 * 
 */
public class KnightTourConfiguration {
	public static boolean checkValidGrid(int grid[][], int row, int col, int num) {
		int n = grid.length;
		if (grid[row][col] == n * n - 1)
			return true;
		int i, j;
		// 2 Up 1 left
		i = row - 2;
		j = col - 1;
		if (i >= 0 && j >= 0 && grid[i][j] == num + 1)
			return checkValidGrid(grid, i, j, num + 1);
		// 2 Up, 1 Right
		i = row - 2;
		j = col + 1;
		if (i >= 0 && j < n && grid[i][j] == num + 1)
			return checkValidGrid(grid, i, j, num + 1);

		// 2 Down 1 left
		i = row + 2;
		j = col - 1;
		if (i < n && j >= 0 && grid[i][j] == num + 1)
			return checkValidGrid(grid, i, j, num + 1);
		// 2 Down, 1 Right
		i = row + 2;
		j = col + 1;
		if (i < n && j < n && grid[i][j] == num + 1)
			return checkValidGrid(grid, i, j, num + 1);

		// 2 Left, 1 Up
		i = row - 1;
		j = col - 2;
		if (i >= 0 && j >= 0 && grid[i][j] == num + 1)
			return checkValidGrid(grid, i, j, num + 1);
		// 2 Left, 1 Down
		i = row + 1;
		j = col - 2;
		if (i < n && j >= 0 && grid[i][j] == num + 1)
			return checkValidGrid(grid, i, j, num + 1);

		// 2 Right, 1 Up
		i = row - 1;
		j = col + 2;
		if (i >= 0 && j < n && grid[i][j] == num + 1)
			return checkValidGrid(grid, i, j, num + 1);
		// 2 Right, 1 Down
		i = row + 1;
		j = col + 2;
		if (i < n && j < n && grid[i][j] == num + 1)
			return checkValidGrid(grid, i, j, num + 1);

		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grid[][] = { { 0, 11, 16, 5, 20 }, { 17, 4, 19, 10, 15 }, { 12, 1, 8, 21, 6 }, { 3, 18, 23, 14, 9 },
				{ 24, 13, 2, 7, 22 } };
		int grid1[][]= {{0,3,6},{5,8,1},{2,7,4}};
		System.out.println(checkValidGrid(grid1, 0, 0, 0));

	}

}
