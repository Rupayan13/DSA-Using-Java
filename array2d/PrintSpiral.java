/**
 * 
 */
package array2d;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PrintSpiral {
	public static void printSpiralOrder(int arr[][], int r, int c) {
		int topRow=0, bottomRow=r-1, leftCol=0, rightCol=c-1;
		int totalElemets=0;
		while(totalElemets < r*c) {
			//top row-> left col to right col
			for(int j=leftCol;j<=rightCol && totalElemets < r*c;j++) {
				System.out.print(arr[topRow][j]+" ");
				totalElemets++;
			}
			topRow++;
			
			//right col-> top row to bottom row
			for(int i=topRow;i<=bottomRow && totalElemets < r*c;i++) {
				System.out.print(arr[i][rightCol]+" ");
				totalElemets++;
			}
			rightCol--;
			
			//bottom row -> right col to left col
			for(int j=rightCol;j>=leftCol && totalElemets < r*c;j--) {
				System.out.print(arr[bottomRow][j]+" ");
				totalElemets++;
			}
			bottomRow--;
			
			//left col -> bottom row to top row
			for(int i=bottomRow;i>=topRow && totalElemets < r*c;i--) {
				System.out.print(arr[i][leftCol]+" ");
				totalElemets++;
			}
			leftCol++;
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

		System.out.println("Spiral Order:-");
		printSpiralOrder(arr, r, c);

	}

}
