/**
 * 
 */
package recursion;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PalindromeForInteger {
	public static int reverse(int n, int num) {
		//base case
		if(n==0) {
			return 0;
		}
		//recursive work
		int smallAns=reverse(n/10, num-1);
		//self work
		int ans=((n%10)*(int)Math.pow(10, num-1))+smallAns;
		return ans;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=n;
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		int x = reverse(num, count);
		System.out.println(x);
		if(x==num) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
