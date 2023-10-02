/**
 * 
 */
package array2d;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class MultiDimensionalArray {
	public static void printArray(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
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
		System.out.println("Enter number of rows :");
		int r=sc.nextInt();
		System.out.println("Enter number of columns :");
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.println("Enter the numbers in row "+i+" column "+j+" :");
				arr[i][j]=sc.nextInt();
			}
		}
		printArray(arr);
		

	}

}
