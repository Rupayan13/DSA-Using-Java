/**
 * 
 */
package recursion;

import java.util.Scanner;

/**
 * @author Rupayan Dirghangi
 *
 */
public class FibbonacciSeries {
	public static int fibbonacciSeries(int n) {
		//base cases
		if(n==0 || n==1) {
			return n;
		}
		//Sub Problems
		int prev=fibbonacciSeries(n-1);
		int prevPrev=fibbonacciSeries(n-2);
		//self work
		int fibonacci=prev+prevPrev;
		
		return fibonacci;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(fibbonacciSeries(6));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(fibbonacciSeries(i));
		}

	}

}
