/**
 * 
 */
package array2d;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class RectangleSumUsingPrefixSum {
	public static void findPrefixSumMatrix(int arr[][]) {
		int r = arr.length;
		if (r == 0) {
			return;
		}
		int c = arr[0].length;

		// traverse horizontally to calculate row wise prefix sum
		for (int i = 0; i < r; i++) {
			for (int j = 1; j < c; j++) {
				arr[i][j] += arr[i][j - 1];
			}
		}
		// traverse vertically to calculate column-wise prefix sum
		for (int j = 0; j < c; j++) {
			for (int i = 1; i < r; i++) {
				arr[i][j] += arr[i - 1][j];
			}
		}

	}

//	public static int findSum(int arr[][], int r1, int c1, int r2, int c2) {
//		int sum = 0;
//		findPrefixSumMatrix(arr);
//
//		for (int i = r1; i <= r2; i++) {
//			if (c1 > 0) {
//				sum += arr[i][c2] - arr[i][c1 - 1];
//			} else {
//				sum += arr[i][c2];
//			}
//		}
//		return sum;
//	}

	public static int findSum2(int arr[][], int r1, int c1, int r2, int c2) {
		int ans = 0;
		int sum = 0, up = 0, left = 0, leftUp = 0;
		findPrefixSumMatrix(arr);

		sum = arr[r2][c2];
		if (c1 > 1)
			left = arr[r2][c1 - 1];
		if (r1 > 1)
			up = arr[r1 - 1][c2];
		if (c1 > 1 && r1 > 1)
			leftUp = arr[r1 - 1][c1 - 1];

		ans = sum - up - left + leftUp;
		return ans;
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
		System.out.println("Enter the row bound 1:");
		int r1 = sc.nextInt();
		System.out.println("Enter the column bound 1:");
		int c1 = sc.nextInt();
		System.out.println("Enter the row bound 2:");
		int r2 = sc.nextInt();
		System.out.println("Enter the column bound 2:");
		int c2 = sc.nextInt();
		System.out.println("The Sum is " + findSum2(arr, r1, c1, r2, c2));

	}

}
