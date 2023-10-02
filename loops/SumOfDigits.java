/**
 * 
 */
package loops;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SumOfDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
			sum+=n%10;
			n=n/10;
		}
		System.out.println("The digits sum is "+sum);

	}

}
