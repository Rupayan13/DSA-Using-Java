/**
 * 
 */
package array2d;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class GenerateSpiral {
	public static int[][] generateSpiral(int n) {
		int arr[][]=new int[n][n];
		int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
		int curr = 1;
		while (curr <= n * n) {
			// top row-> left col to right col
			for (int j = leftCol; j <= rightCol && curr <= n * n; j++) {
				arr[topRow][j]=curr++;
			}
			topRow++;

			// right col-> top row to bottom row
			for (int i = topRow; i <= bottomRow && curr <= n * n; i++) {
				arr[i][rightCol]=curr++;
			}
			rightCol--;

			// bottom row -> right col to left col
			for (int j = rightCol; j >= leftCol && curr <= n * n; j--) {
				arr[bottomRow][j]=curr++;
			}
			bottomRow--;

			// left col -> bottom row to top row
			for (int i = bottomRow; i >= topRow && curr <= n * n; i--) {
				arr[i][leftCol]=curr++;
			}
			leftCol++;
		}
		return arr;

	}

	public static void printArray(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the equal row and column number :");
		int n=sc.nextInt();
		int arr[][]=generateSpiral(n);
		printArray(arr);

	}

}
