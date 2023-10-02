/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class MaxElementInArray {
	public static int maxEle(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			max=Math.max(max, arr[i]);
		}
		return max;
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
		System.out.println("Max element of the array is :"+maxEle(arr));

	}

}
