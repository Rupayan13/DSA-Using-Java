/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class CheckSorting {
	public static int[] createArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the element at index " + i + ": ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = createArray();
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1]) {
				System.out.println("Array is not sorted");
				return;
			}
		}
		System.out.println("Array is sorted");

	}

}
