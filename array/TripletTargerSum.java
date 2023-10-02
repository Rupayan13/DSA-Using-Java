/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class TripletTargerSum {
	public static int tripletTargerSum(int arr[], int sum) {
		int count = 0;
		int n = arr.length;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == sum) {
						count++;
					}
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
		int arr[] = { 1, 4, 5, 6, 3 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the targer sum:");
		int sum = sc.nextInt();
		System.out.println("The number of triplet is " + tripletTargerSum(arr, sum));

	}

}
