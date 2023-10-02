/**
 * 
 */
package miscellaneous;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class RotateArray {
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void swap(int arr[], int l, int r) {
		int temp=arr[r];
		arr[r]=arr[l];
		arr[l]=temp;
	}
	public static void reverserArray(int arr[], int l, int r) {
		r--;
		while(l<r) {
			swap(arr, l, r);
			l++;
			r--;
		}
	}
	public static void rotateArray(int arr[], int r) {
		int n = arr.length;
		r=r%n;
		reverserArray(arr, 0, n);
		reverserArray(arr, 0, r);
		reverserArray(arr, r, n);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rotation:");
		int r = sc.nextInt();
		rotateArray(arr, r);
		printArray(arr);

	}

}
