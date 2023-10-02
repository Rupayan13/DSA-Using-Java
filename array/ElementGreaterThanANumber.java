/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ElementGreaterThanANumber {
	public static int countEle(int arr[], int x) {
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>x) {
				count++;
			}
		}
		return count;
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
		System.out.println("Enter the number :");
		int x=sc.nextInt();
		System.out.println("Then numbers of element greater than "+x+" is :"+countEle(arr,x));

	}

}
