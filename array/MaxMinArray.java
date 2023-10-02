/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class MaxMinArray {
	public static int[] maxMinArray(int arr[]) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int arr2[]=new int[2];
		for(int i=0;i<arr.length;i++)
		{
			min=Math.min(min, arr[i]);
			max=Math.max(max, arr[i]);
		}
		arr2[0]=max;
		arr2[1]=min;
		return arr2;
	}
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
		int arr2[]=maxMinArray(arr);
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}

	}

}
