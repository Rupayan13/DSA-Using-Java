/**
 * 
 */
package loops;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class ReverseANumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		int rev=0;
		while(n>0)
		{
			rev=(rev*10)+(n%10);
			n=n/10;
		}
		System.out.println("Reverse of a number is "+rev);

	}

}
