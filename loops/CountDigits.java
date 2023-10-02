/**
 * 
 */
package loops;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class CountDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		int num=n;
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		System.out.println("The number of digits in "+num+" is "+count);

	}

}
