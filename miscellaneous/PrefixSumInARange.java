/**
 * 
 */
package miscellaneous;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PrefixSumInARange {
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
		prefixSum(arr);
		
		System.out.println("Number of queries: ");
		int q=sc.nextInt();
		while(q-->0) {
			System.out.println("Enter range:");
			int l=sc.nextInt();
			int r=sc.nextInt();
			int ans=arr[r]-arr[l-1];
			System.out.println(ans);
		}
		

	}

}
