/**
 * 
 */
package array2d;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class TransposeMatrix {
	public static int[][] transposeMatrix(int arr[][]) {
		int r = arr.length;
		int c = arr[0].length;
		int arr2[][] = new int[c][r];
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				arr2[i][j] = arr[j][i];
			}
		}
		return arr2;
	}

	public static void transposeInPlace(int arr[][], int r, int c) {
		if (r != c) {
			System.out.println("Wrong Input, Columns and Rows are must be equal");
			return;
		}
		for (int i = 0; i < r; i++) {
			for (int j = i; j < c; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int r = sc.nextInt();
		System.out.println("Enter the number of columns :");
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		printArray(arr);
//		int arr2[][]=transposeMatrix(arr);
//		printArray(arr2);
		transposeInPlace(arr, r, c);
		printArray(arr);

	}

}
