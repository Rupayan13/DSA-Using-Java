/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SearchAElement {
	public static int searchEle(int arr[], int x) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				return i;
			}
		}
		return -1;
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
		Scanner sc=new Scanner(System.in);
		int arr[] = createArray();
		System.out.println("Write the element you want to search:");
		int x=sc.nextInt();
		System.out.println(searchEle(arr, x));

	}

}
