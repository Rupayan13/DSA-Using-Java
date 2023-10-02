/**
 * 
 */
package array2d;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Rotation90DegreeClockWise {
	public static void reverseArray(int matrix[], int l, int r) {
		r--;
		while (l < r) {
			swap(matrix, l, r);
			l++;
			r--;
		}
	}

	public static void swap(int arr[], int l, int r) {
		int temp = arr[r];
		arr[r] = arr[l];
		arr[l] = temp;
	}

	public static void rotate(int arr[][], int r, int c) {
		if (r != c) {
			System.out.println("Wrong Input, Columns and Rows are must be equal");
			return;
		}
		transposeInPlace(arr, r, c);
		for (int i = 0; i < r; i++) {
			reverseArray(arr[i], 0, arr[i].length);
		}
	}

	public static void transposeInPlace(int arr[][], int r, int c) {

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
		System.out.println("Input matrix:-");
		printArray(arr);

		rotate(arr, r, c);

		System.out.println("Rotation of matrix :");
		printArray(arr);

	}

}
