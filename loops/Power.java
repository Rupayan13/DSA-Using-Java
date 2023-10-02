/**
 * 
 */
package loops;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class Power {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		System.out.println("Enter the power :");
		int p=sc.nextInt();
		int res=1;
		for(int i=1;i<=p;i++)
		{
			res*=n;
		}
		System.out.println(n+"^"+p+" is "+res);

	}

}
