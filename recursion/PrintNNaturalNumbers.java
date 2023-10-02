/**
 * 
 */
package recursion;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class PrintNNaturalNumbers {
	public static void printIncreasing(int n) {
		if(n==1) {
			System.out.println(1);
			return;
		}
		printIncreasing(n-1);
		System.out.println(n);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printIncreasing(n);

	}

}
