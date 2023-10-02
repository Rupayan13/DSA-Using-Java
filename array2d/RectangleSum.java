/**
 * 
 */
package array2d;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class RectangleSum {
	public static int findSum(int arr[][], int r1, int c1, int r2, int c2) {
		int sum=0;
		for(int i=r1;i<=r2;i++) {
			for(int j=c1;j<=c2;j++) {
				sum+=arr[i][j];
			}
		}
		
		return sum;
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
		System.out.println("The Sum is "+findSum(arr, r1, c1, r2, c2));
		

	}

}
