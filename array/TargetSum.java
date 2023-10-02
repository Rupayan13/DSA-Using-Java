/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class TargetSum {
	public static int countTargetSum(int arr[], int sum) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					count++;
				}
			}
		}
		return count;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = { 4, 6, 3, 5, 8, 2 };
		System.out.println("Enter the number(sum):");
		int sum = sc.nextInt();
		System.out.println("The number of pairs are " + countTargetSum(arr, sum));

	}

}
