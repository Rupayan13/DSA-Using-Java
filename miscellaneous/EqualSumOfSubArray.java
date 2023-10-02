/**
 * 
 */
package miscellaneous;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class EqualSumOfSubArray {
	public static int totalSum(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static boolean equalsumPartition(int arr[]) {
		int totalSum=totalSum(arr);
		int prefSum=0;
		for(int i=0;i<arr.length;i++)
		{
			prefSum+=arr[i];
			int suffixSum=totalSum-prefSum;
			if(suffixSum==prefSum) {
				return true;
			}
		}
		return false;
	}
	public static boolean equalSumPartition(int arr[]) {
		int totalSum=0;
		for(int i=0;i<arr.length;i++)
		{
			int prefixSum=arr[i];
			int suffixSum=arr[arr.length-1]-arr[i];
			if(prefixSum==suffixSum) {
				return true;
			}
		}
		return false;
	}
	public static void prefixSum(int arr[]) {
		for(int i=1;i<arr.length;i++)
		{
			arr[i]=arr[i-1]+arr[i];
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms in ar array:");
		int n=sc.nextInt();
		int arr[]=new int[n+1];
		System.out.println("Enter "+n+" elements:");
		for(int i=1;i<=n;i++) {
			arr[i]=sc.nextInt();
		}
//		prefixSum(arr);
//		System.out.println("Equal partition possible :"+equalSumPartition(arr));
		System.out.println("Equal partition possible :"+equalsumPartition(arr));
	}

}
