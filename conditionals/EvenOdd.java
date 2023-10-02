/**
 * 
 */
package conditionals;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class EvenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
//		System.out.println(n);
		if(n%2==0)
		{
			System.out.println(n+" is even.");
		}
		else {
			System.out.println(n+" is odd");
		}

	}

}
