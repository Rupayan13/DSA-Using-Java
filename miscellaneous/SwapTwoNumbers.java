/**
 * 
 */
package miscellaneous;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class SwapTwoNumbers {
	public static void swapTwoNumbers() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Values before swapping:-");
		System.out.println(a+" "+b);
		System.out.println("Values after swapping:-");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapTwoNumbers();

	}

}
