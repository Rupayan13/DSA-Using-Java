/**
 * 
 */
package loops;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class NFactorialNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Factorial of "+i+" is "+factorial(i));
		}

	}
	public static int factorial(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f*=i;
		}
		return f;
	}

}
