/**
 * 
 */
package array2d;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class MatrixAddition {
	public static void printArray(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void matrixAddition(int arr1[][], int r1, int c1, int arr2[][], int r2, int c2) {
		if(r1!=r2 || c1!=c2) {
			System.out.println("Wrong Input - Addition not possible");
			return;
		}
		int sum[][]=new int[r1][c1];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		printArray(sum);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first matrix details:-");
		System.out.println("Enter the row number of matrix 1:");
		int r1 = sc.nextInt();
		System.out.println("Enter the column number of matrix 1:");
		int c1 = sc.nextInt();
		
		System.out.println("Enter the second matrix details:-");
		System.out.println("Enter the row number of matrix 2:");
		int r2 = sc.nextInt();
		System.out.println("Enter the column number of matrix 2:");
		int c2 = sc.nextInt();
		
		System.out.println("Enter matrix 1:");
		int arr1[][] = new int[r1][c1];
		int arr2[][] = new int[r2][c2];
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				System.out.println("Enter the numbers in row "+i+" column "+j+" :");
				arr1[i][j]=sc.nextInt();
			}
		}
		printArray(arr1);
		System.out.println("Enter matrix 2:");
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				System.out.println("Enter the numbers in row "+i+" column "+j+" :");
				arr2[i][j]=sc.nextInt();
			}
		}
		printArray(arr2);
		System.out.println("Summation Matrix is :");
		matrixAddition(arr1, r1, c1, arr2, r2, c2);

	}

}
